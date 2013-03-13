package testing.lab1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@Test(dataProvider = "provideTestDataX")
	public void shouldXYZ() {

	}

	@DataProvider
	private Object[][] provideTestData() {
		return null;
	}

}
