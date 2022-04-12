package com.qa.restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAndPostExamples {

	@Test
	public void test_2() {

		baseURI = "https://reqres.in/api";
		// Response response=;

		given().get("/users?page=2").then().statusCode(200).body("data[1].id", equalTo(8)).body("data.first_name",
				hasItems("Lindsay", "George"));

	}
	
	@Test
	public void test_3() {

		baseURI = "https://reqres.in/api";
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name", "abc@xyz.com");
		jsonObject.put("job", "tester");

		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(jsonObject.toJSONString()).
			post("/users").
		then().
			statusCode(201);

	}
}
