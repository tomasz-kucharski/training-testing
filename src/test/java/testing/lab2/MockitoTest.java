package testing.lab2;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class MockitoTest {
	private static final Logger log = LoggerFactory.getLogger(MockitoTest.class);

	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	public void test() {
		List<String> mockedList = mock(List.class);
		mockedList.add("one");
		mockedList.clear();

		verify(mockedList).add("one");
		verify(mockedList).clear();
	}

	public void stubbing() {
		LinkedList mockedList = mock(LinkedList.class);

		when(mockedList.get(0)).thenReturn("first");
//		when(mockedList.get(1)).thenThrow(new RuntimeException());

		log.debug("Element 0: " + mockedList.get(0));
		log.debug("Element 1: " + mockedList.get(1));
		log.debug("Element 999: " + mockedList.get(999));

		verify(mockedList).get(0);

	}

}
