package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;

	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage = homePage.clickOnContactsLink();
		System.out.println("Clicked on contacts link");
		testUtil = new TestUtil();
	}

	@DataProvider
	public Object[][] getCRMTestData() {

		Object[][] data = TestUtil.getTestData("ContactsList");
		return data;

	}

	@Test(priority = 1,dataProvider="getCRMTestData")
	public void createNewContactTest(String firstName, String lastName, String company) {

		contactsPage.createNewContact(firstName, lastName, company);
		
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
