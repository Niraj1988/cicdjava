package continuous;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class demo {

	
public static WebDriver driver;
	
	
	@BeforeMethod
	public void launchDriver() throws MalformedURLException {
//		DesiredCapabilities dr = null;
//		dr = DesiredCapabilities.chrome();
//		dr.setBrowserName("chrome");
//		dr.setPlatform(Platform.LINUX);
//		System.setProperty("webdriver.chrome.driver", "P:\\2. Selenium Data\\Drivers\\chromedriver.exe");
//		
//		//driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), dr);
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().fullscreen();
		System.out.println("Before Scenerio");
	}
	
	@Test
	public void Test1() {
		System.out.println("Execute Test1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Execute Test2");
		assertEquals(2, 3);
	}
	
	@Test
	public void Test3() {
		System.out.println("Execute Test3");
	}
	
	@AfterMethod
	public void quit(ITestResult result) throws JiraException {
//		driver.quit();
//		//if test case fails then log the defect in JIRA
//		if(result.getStatus() == ITestResult.FAILURE) {
//			
//			BasicCredentials creds = new BasicCredentials("admin", "admin");
//			JiraClient jira = new JiraClient("http://localhost:8081", creds);
//			Issue issueName = jira.createIssue("AUT", "Bug").field(Field.SUMMARY, result.getMethod().getMethodName() +"is failed due to: "+ result.getThrowable().toString()).field(Field.DESCRIPTION, "get the description").execute();
//			System.out.println("Issue is created in JIRA with issue key: "+issueName.getKey());
		//}
	}
	}
