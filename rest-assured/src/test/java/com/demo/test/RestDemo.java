package com.demo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.util.Payload;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RestDemo {

	@Test
	public void postRequestDemo() throws IOException {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(new String(Files.readAllBytes(Paths.get("F:\\Automation\\API Testing\\addplace.json")))).when()
				.post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.header("Access-Control-Max-Age", "3600").body("status", equalTo("OK")).extract().response().asString();

		/*
		 * JsonPath json=new JsonPath(response);
		 * 
		 * String placeId= json.getString("place_id");
		 * 
		 * System.out.println(placeId);
		 * 
		 * String newAddress="70 winter walk, USA";
		 * 
		 * given().queryParam("key",
		 * "qaclick123").header("Content-Type","application/json").body("{\r\n" +
		 * "\"place_id\":\""+placeId+"\",\r\n" + "\"address\":\""+newAddress+"\",\r\n" +
		 * "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "")
		 * .when().put("maps/api/place/update/json")
		 * .then().assertThat().statusCode(200).body("msg",
		 * equalTo("Address successfully updated"));
		 * 
		 * String response_GET=given().queryParam("key",
		 * "qaclick123").queryParam("place_id", placeId).
		 * when().get("maps/api/place/get/json").
		 * then().assertThat().statusCode(200).extract().response().asString(); json=new
		 * JsonPath(response_GET); String actualAddress=json.getString("address");
		 * 
		 * Assert.assertEquals(actualAddress, newAddress);
		 */
	}

	@Test(enabled = false)
	public void jsonExtraction() {

		JsonPath json = new JsonPath(Payload.getCourseDetails());

		int noOfCourses = json.getInt("courses.size()");
		System.out.println(noOfCourses);

		int totalAmount = json.getInt("dashboard.purchaseAmount");

		System.out.println(totalAmount);

		String courseName = json.getString("courses[0].title");
		System.out.println(courseName);

		int price;
		int copies;
		int sum;
		int totalPrice = 0;

		for (int i = 0; i < noOfCourses; i++) {

			price = json.get("courses[" + i + "].price");
			copies = json.get("courses[" + i + "].copies");
			sum = price * copies;
			totalPrice = totalPrice + sum;

		}

		System.out.println("Total price:" + totalPrice);

		Assert.assertEquals(totalPrice, totalAmount);
	}

}
