package com.demo.test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.util.Payload;
import com.demo.util.ReUsableMethods;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class LibraryAPI {
	
	@Test(dataProvider = "BooksData")
	
	public void addBookToLibrary(String isbn, String aisle) {
		
		baseURI="http://216.10.245.166";
		String response=given().header("Content-Type","application/json").body(Payload.addBook(isbn,aisle))
		.when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jsonPath=ReUsableMethods.rawToJson(response);
		String id=jsonPath.get("ID");
		System.out.println(id);
		
		given().header("Content-Type","application/json").body("{\r\n" + 
				" \r\n" + 
				"\"ID\" : \""+id+"\"\r\n" + 
				" \r\n" + 
				"} \r\n" + 
				"")
		.when().post("/Library/DeleteBook.php")
		.then().log().all().assertThat().statusCode(200);
	}

	
	@DataProvider(name = "BooksData")
	public Object[][] sendData(){
		
		
		return new Object[][] {{"rohan","1602"},{"Manju","1508"}};
		
	}
	

}
