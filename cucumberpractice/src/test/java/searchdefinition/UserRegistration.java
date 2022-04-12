package searchdefinition;

import java.util.Iterator;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration {
	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	    System.out.println("User is on registration page");
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable dataTable) {
	  List<List<String>> li= dataTable.asLists();
	  for (List<String> list : li) {
		  for (String list2 : list) {
			System.out.println(list2);
		}
		
	}
	}

	@Then("user details are stored successfully")
	public void user_details_are_stored_successfully() {
	    System.out.println("user details are stored successfully");
	}
}
