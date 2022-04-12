package com.qa.restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JsonSchemaValidation {

	@Test
	public void test_2() {
		
		baseURI="https://reqres.in/api";
		
		
		given().
			get("/users?page=2").
		then().assertThat().body(matchesJsonSchemaInClasspath("schema.json")).
			statusCode(200);
			
		
	}
}
