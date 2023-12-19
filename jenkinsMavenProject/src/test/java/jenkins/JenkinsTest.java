package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {
	@Test
	public void demo() {
		Reporter.log("JenkinsTest class executed...",true);
	}
}
