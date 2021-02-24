package org.testng1;

import org.testng.annotations.DataProvider;

public class Sample {

	@DataProvider(name = "data")
	public static Object[][] getData() {
		return new Object[][] { { "abc", "def" }, { "ghi", "jkl" } };

	}
}
