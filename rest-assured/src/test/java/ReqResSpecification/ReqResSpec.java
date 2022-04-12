package ReqResSpecification;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.util.Location;
import com.util.LocationDetails;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ReqResSpec {
	
	@Test
	public void specificationDemo()
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
		
		RequestSpecification req= new RequestSpecBuilder().setBaseUri(baseURI).addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();
		
		RequestSpecification res=given().spec(req).body(details);
		
		ResponseSpecification responseSpecification=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		Response response=res
		.when().post("/maps/api/place/add/json")
		.then().spec(responseSpecification).extract().response();
		
		String respo=response.asString();
		System.out.println(respo);
		
	}
}
