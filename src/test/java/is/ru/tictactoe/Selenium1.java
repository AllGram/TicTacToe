import junit.framework.Test;
import junit.framework.TestSuite;

public class Selenium1 {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(Untitled.class);
		return suite;
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}
