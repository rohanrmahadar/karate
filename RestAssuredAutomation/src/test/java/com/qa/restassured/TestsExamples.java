package com.qa.restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestsExamples {

	
	  @Test public void test_1() {
	  
	  Response response=get("https://reqres.in/api/users?page=2");
	  
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getStatusLine());
	  System.out.println(response.getBody().asString());
	  System.out.println(response.getHeader("content-type"));
	  
	  Assert.assertEquals(response.getStatusCode(), 200); }
	 
	
	@Test
	public void test_2() {
		
		baseURI="https://reqres.in/api";
		//Response response=;
		
		given().
			get("/users?page=2").
		then().
			statusCode(200).
			body("data[1].id",equalTo(8));
		
	}
}
 