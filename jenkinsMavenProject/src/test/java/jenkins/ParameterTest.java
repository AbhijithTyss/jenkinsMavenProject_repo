package jenkins;

import org.testng.annotations.Test;

public class ParameterTest {
	@Test
	public void test() {
		String BROWSER = System.getProperty("Browser");
		System.out.println(BROWSER);
	}
}
