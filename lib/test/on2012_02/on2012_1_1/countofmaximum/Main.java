package on2012_02.on2012_1_1.countofmaximum;

import net.egork.chelper.tester.Tester;
import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!Tester.test("net.egork.utils.io.InputReader",
			"on2012_02.on2012_1_1.countofmaximum.CountOfMaximum",
			"MULTI_NUMBER",
			"2/__5/__1 2 3 2 5/__6/__1 2 2 1 1 2/__;;2 2/__1 3/__;;true",
			"net.egork.utils.io.OutputWriter"))
		{
			Assert.fail();
		}
	}
}
