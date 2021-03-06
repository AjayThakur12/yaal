package net.egork;

import net.egork.collections.map.Counter;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Map;

public class TaskF {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		Counter<String> counter = new Counter<>();
		for (int i = 0; i < count - 1; i++) {
			counter.add(in.readString());
			in.readString();
		}
		String answer = null;
		long max = 0;
		for (Map.Entry<String, Long> entry : counter.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				answer = entry.getKey();
			}
		}
		out.printLine(answer);
	}
}
