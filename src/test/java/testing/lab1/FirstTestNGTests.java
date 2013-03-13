package testing.lab1;

import org.testng.Assert;
import org.testng.annotations.Test;
import testing.FilterUtils;

/**
 * Write simple test
 */
public class FirstTestNGTests {

	@Test
	public void shouldDoAnything() {
		//write simple test
		boolean result = FilterUtils.validFilterString("");
		Assert.assertEquals(true, result);
	}

}
