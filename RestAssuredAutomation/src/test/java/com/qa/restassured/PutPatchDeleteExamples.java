package com.qa.restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class PutPatchDeleteExamples {

	@SuppressWarnings("unchecked")
	@Test(priority = 1,enabled = false)
	public void testPut() {

		baseURI = "https://reqres.in/api";

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "manjushri");
		jsonObject.put("job", "senior analyst");

		given().header("contentType", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(jsonObject.toJSONString()).when().put("/users").then().statusCode(200).log().all();

	}

	@SuppressWarnings("unchecked")
	@Test(priority =2,enabled = false)
	public void testPatch() {

		baseURI="https://reqres.in/api/";
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name", "manjushri");
		jsonObject.put("job", "senior analyst");
		
		given().header("contentType","application/json").accept(ContentType.JSON).contentType(ContentType.JSON).body(jsonObject.toJSONString()).
		when().patch("/users/2").
		then().statusCode(200).log().all();

	}
	
	@SuppressWarnings("unchecked")
	@Test(priority =3)
	public void testDelete() {

		baseURI="https://reqres.in/api/";
		
		/*
		 * JSONObject jsonObject=new JSONObject(); jsonObject.put("name", "manjushri");
		 * jsonObject.put("job", "senior analyst");
		 */
		
		given().header("contentType","application/json").accept(ContentType.JSON).contentType(ContentType.JSON).
		when().patch("/users/2").
		then().statusCode(200).log().all();

	}

}
