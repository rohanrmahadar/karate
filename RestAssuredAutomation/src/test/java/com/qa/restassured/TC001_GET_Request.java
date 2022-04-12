/*
 * package com.qa.restassured;
 * 
 * import org.json.simple.JSONObject; import org.testng.Assert; import
 * org.testng.annotations.Test; import io.restassured.RestAssured; import
 * io.restassured.http.Method; import io.restassured.response.Response; import
 * io.restassured.specification.RequestSpecification;
 * 
 * public class TC001_GET_Request {
 * 
 * @Test public void getWeatherDetails() {
 * 
 * RestAssured.baseURI="https://reqres.in/api/users"; RequestSpecification
 * specification=RestAssured.given();
 * 
 * Response response=specification.request(Method.GET,"/2");
 * 
 * int statusCode=response.getStatusCode(); System.out.println(statusCode);
 * Assert.assertEquals(statusCode, 200); }
 * 
 * @SuppressWarnings("unchecked")
 * 
 * @Test public void postRequest() {
 * 
 * RestAssured.baseURI="https://reqres.in/api"; RequestSpecification
 * httpsRequest=RestAssured.given(); JSONObject jsonObject=new JSONObject();
 * jsonObject.put("email", "eve.holt@reqres.in"); jsonObject.put("password",
 * "pistol"); httpsRequest.header("Content-Type","application/json");
 * httpsRequest.body(jsonObject.toJSONString());
 * 
 * Response response=httpsRequest.request(Method.POST,"/register"); String
 * responseBody=response.getBody().asString(); System.out.println(responseBody);
 * int statusCode=response.getStatusCode(); System.out.println(statusCode);
 * Assert.assertEquals(statusCode, 200);
 * 
 * String contentType=response.header("Content-Type");
 * System.out.println(contentType); Assert.assertEquals(contentType,
 * "application/json; charset=utf-8");
 * 
 * int id= response.jsonPath().get("id"); System.out.println(id);
 * Assert.assertEquals(id, 4); } }
 */