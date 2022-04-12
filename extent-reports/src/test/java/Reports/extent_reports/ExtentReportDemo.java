package Reports.extent_reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

	ExtentReports extentReports;

	@BeforeTest
	public void setUp() {

		String path = System.getProperty("user.dir") + "\\reports\\" + "index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setReportName("Web Automation reports");
		extentReports = new ExtentReports();
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Tester", "Rohan");
	}

	@Test
	public void initialDemo() {
		
		ExtentTest test=extentReports.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/");
		String title=driver.getTitle();
		System.out.println(title);
		test.fail("Results do not match");
		test.addScreenCaptureFromBase64String("xyz");
		extentReports.flush();
	}
}
