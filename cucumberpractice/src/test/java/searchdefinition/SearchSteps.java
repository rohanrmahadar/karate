package searchdefinition;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Assert;

import implementation.Product;
import implementation.Search;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	Product product;
	Search search;
	
	@Given("I have a search field on amazon")
	public void i_have_a_search_field_on_amazon() {
		System.out.println("Step1: I am on search page");
	}

	@When("^I search for product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: search the product with name: " + productName + " and price: " + price);
		product=new Product(productName, price);
	}
	
	@When("User enters following details")
	public void user_enters_following_details(DataTable dataTable) {
		List<List<String>> userList=dataTable.asLists(String.class);   
		for (List<String> list : userList) {
			System.out.println(list);
		}
	}
	@When("User enters following details with columns")
	public void user_enters_following_details_with_columns(DataTable dataTable) {
	  List<Map<String, String>> userList= dataTable.asMaps(String.class, String.class);
	  
	  for (Map<String, String> map : userList) {
				 		 
		System.out.print(map.get("firstname"));
		System.out.print(map.get("lastname"));
		System.out.print(map.get("email"));
		System.out.print(map.get("location"));
		System.out.println();
		 
	}
	}


	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step3: product "+productName+" is displayed");
		search=new Search();
		String name=search.displayProduct(product);
		System.out.println("Product name: "+name);
		Assert.assertEquals(product.getProductName(),name);
	}
}
