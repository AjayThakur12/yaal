package net.egork;

import net.egork.numbers.Matrix;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class BuildingAllowance {
	private static final int MOD = 1000000007;

	public void solve(int testNumber, InputReader in, OutputWriter out) {
		long n = in.readInt();
		Matrix matrix = new Matrix(2, 2);
		matrix.data[0][0] = matrix.data[0][1] = matrix.data[1][0] = 1;
		Matrix.mod = MOD;
		matrix = matrix.power(n + 1);
		long answer = (matrix.data[0][0] * matrix.data[0][0]) % MOD;
		out.printLine(answer);
	}
}
