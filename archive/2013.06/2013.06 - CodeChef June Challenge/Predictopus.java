package net.egork;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class Predictopus {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		double probability = in.readDouble();
		probability = Math.max(probability, 1 - probability);
		out.printLine(1e4 * (3 - 2 * probability) * probability);
	}
}
