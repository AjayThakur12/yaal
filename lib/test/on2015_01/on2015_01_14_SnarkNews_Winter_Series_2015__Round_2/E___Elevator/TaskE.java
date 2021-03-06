package on2015_01.on2015_01_14_SnarkNews_Winter_Series_2015__Round_2.E___Elevator;



import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskE {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		int[] qty = in.readIntArray(count);
		long[] sum = ArrayUtils.partialSums(qty);
		long[] weightedSum = new long[sum.length];
		for (int i = 1; i <= count; i++) weightedSum[i] = weightedSum[i - 1] + sum[i];
		long[] answer = new long[count];
		answer[0] = sum[count] - sum[1];
		for (int i = 1; i < count; i++) {
			long delta = sum[count] - sum[i + 1];
			answer[i] = answer[i - 1];
			for (int j = i - 2; j >= 0; j--) {
				answer[i] = Math.min(answer[i], answer[j] + weightedSum[i] - weightedSum[j + 1] - (i - j - 1) * sum[j + 1]);
			}
			answer[i] = Math.min(answer[i], weightedSum[i]);
			answer[i] += delta;
		}
		out.printLine(answer[count - 1]);
    }
}
