package is.ru.tictactoe;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class Selenium1 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://allgram.herokuapp.com";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testSelenium1() throws Exception {
		selenium.open("/");
		selenium.click("id=0");
		selenium.click("id=4");
		selenium.click("id=1");
		selenium.click("id=5");
		selenium.click("id=2");
		assertEquals("Player one WINS!!!!", selenium.getAlert());
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
