package net.egork;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskL {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		out.print(in.readCharacter());
		in.readCharacter();
		in.readCharacter();
		out.printLine(in.readCharacter());
	}
}
