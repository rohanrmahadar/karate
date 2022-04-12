package com.qa.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ValidateXML {

	@Test
	public void validateXMLResponse() throws IOException {
		
		baseURI="http://www.dneonline.com";
		File file=new File("./SoapResource/soap.xml");
		
		if (file.exists()) {
			
			FileInputStream fileInputStream=new FileInputStream(file);
			
			
			String requestBody=IOUtils.toString(fileInputStream,"UTF-8");
			given().contentType("text/xml").accept(ContentType.XML).body(requestBody).
			when().post("/calculator.asmx").
			then().statusCode(200).log().all();
		}
		
		
	}
}
