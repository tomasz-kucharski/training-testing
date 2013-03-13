package testing.lab1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	private static final Logger log = LoggerFactory.getLogger(TestNGDataProvider.class);

	@Test(dataProvider = "provideTestData")
	public void logData(String name, Integer age) {
		log.debug(name + " is " + age + " years old.");
	}

	@DataProvider
	private Object[][] provideTestData() {
		return new Object[][]{
				{"Anna", 15},
				{"Jakub", 20},
		};
	}

}
