package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	@Before("@Smoke")
	public void setup_browser(Scenario sc) {
		System.out.println("Launch the browser");
		//System.out.println(sc.getName());
	}
	
	/*
	 * @Before(order = 2) public void setup_url(Scenario sc) {
	 * System.out.println("Launch the url"); System.out.println(sc.getName()); }
	 */
	
	@After("@Smoke")
	public void logout(Scenario sc) {
		System.out.println("Logout from application");
		//System.out.println(sc.getName());
	}
	
	/*
	 * @After(order = 2) public void tearDown(Scenario sc) {
	 * System.out.println("Close the browser"); System.out.println(sc.getName()); }
	 * 
	 * @BeforeStep public void takeScreenShot() {
	 * System.out.println("take the screenshot"); }
	 * 
	 * @AfterStep public void refresh() { System.out.println("Refresh the page"); }
	 */
	
}
