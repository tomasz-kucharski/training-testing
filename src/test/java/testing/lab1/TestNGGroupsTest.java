package testing.lab1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import testing.TestGroups;

public class TestNGGroupsTest {
	private static final Logger log = LoggerFactory.getLogger(TestNGGroupsTest.class);

	@Test(groups = {"unit"})
	public void aFastTest() {
		log.info("Fast test");
	}

	@Test(groups = {TestGroups.INTEGRATION})
	public void aSlowTest() {
		log.info("Slow test");
	}

}
