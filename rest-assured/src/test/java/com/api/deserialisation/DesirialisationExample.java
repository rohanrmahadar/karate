package com.api.deserialisation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.util.Coindesk;

import io.restassured.parsing.Parser;

public class DesirialisationExample {

	@Test
	public void deserialisationExample() {
		
		ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
       
		Coindesk coindesk=given().expect().defaultParser(Parser.JSON).when().get("https://api.coindesk.com/v1/bpi/currentprice.json").as(Coindesk.class);
		
		System.out.println(coindesk.getDisclaimer());		
		
		System.out.println(coindesk.getBpi().getUSD().getRate());
	}
	
}
