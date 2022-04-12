package com.api.deserialisation;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.util.Location;
import com.util.LocationDetails;

public class Serialisation {
	
	@Test
	public void serialisationDemo()
	{
		
		LocationDetails details=new LocationDetails();
		details.setAccuracy(50);
		details.setAddress("karad");
		details.setLanguage("Marathi");
		details.setName("Rohan");
		details.setWebsite("LinkedIN");
		details.setPhone_number("9090909090");
		Location lo=new Location();
		lo.setLat("17.17");lo.setLng("74.34");
		details.setLocation(lo);
		List<String> list=new ArrayList<String>();
		list.add("shoe park");
		list.add("shop");
		details.setTypes(list);
		
		baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").body(details)
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
		
	}
}
