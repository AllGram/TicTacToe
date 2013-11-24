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
import java.util.concurrent.TimeUnit;

public class allgramtictactoeIT {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://allgramtictactoe.herokuapp.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testAllgramtictactoeIT() throws Exception {
		selenium.open("/");
		selenium.click("id=0");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=4");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=1");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=5");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=2");
		TimeUnit.SECONDS.sleep(1);
		selenium.setSpeed("5000");
		assertEquals("1!", selenium.getValue("id=2"));
		TimeUnit.SECONDS.sleep(1);
	}

	@Test
	public void testAllgramtictactoe2IT() throws Exception {
		selenium.open("/");
		selenium.click("id=0");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=3");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=1");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=4");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=7");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=5");
		TimeUnit.SECONDS.sleep(1);
		selenium.setSpeed("5000");
		assertEquals("2!", selenium.getValue("id=5"));
		TimeUnit.SECONDS.sleep(1);
	}

	@Test
	public void testAllgramtictactoe3IT() throws Exception {
		selenium.open("/");
		selenium.click("id=0");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=1");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=2");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=4");//y
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=3");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=5");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=7");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=6");
		TimeUnit.SECONDS.sleep(1);
		selenium.click("id=8");
		TimeUnit.SECONDS.sleep(1);
		selenium.setSpeed("5000");
		assertEquals("Tie", selenium.getValue("id=8"));
		TimeUnit.SECONDS.sleep(1);
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
