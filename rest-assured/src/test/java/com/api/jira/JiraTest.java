package com.api.jira;

import org.testng.annotations.Test;

import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;

public class JiraTest {

	// @Test
	public void jiraApiTesting() {

		baseURI = "http://localhost:8080/";
		SessionFilter sessionFilter = new SessionFilter();
		String response = given().log().all().header("Content-Type", "application/json")
				.body("{ \"username\": \"rohanrmahadar\", \"password\": \"Rohan@1508\" }").when().filter(sessionFilter)
				.post("/rest/auth/1/session").then().log().all().extract().response().asString();

		String sessionId;
		given().log().all().header("Content-Type", "application/json")
				.body("{\r\n" + "    \"fields\": {\r\n" + "       \"project\":\r\n" + "       {\r\n"
						+ "          \"key\": \"RPA\"\r\n" + "       },\r\n"
						+ "       \"summary\": \"Debit issue\",\r\n"
						+ "       \"description\": \"Creating of an issue using the REST API\",\r\n"
						+ "       \"issuetype\": {\r\n" + "          \"name\": \"Bug\"\r\n" + "       }\r\n"
						+ "   }\r\n" + "}")
				.when().filter(sessionFilter).post("rest/api/2/issue/").then().log().all().assertThat().statusCode(201);
	}

	// @Test
	public void jiraApiTestingAddComment() {

		baseURI = "http://localhost:8080/";
		SessionFilter sessionFilter = new SessionFilter();
		String response = given().log().all().header("Content-Type", "application/json")
				.body("{ \"username\": \"rohanrmahadar\", \"password\": \"Rohan@1508\" }").when().filter(sessionFilter)
				.post("/rest/auth/1/session").then().log().all().extract().response().asString();

		String sessionId;
		given().log().all().pathParam("key", "10101").header("Content-Type", "application/json")
				.body("{\r\n" + "    \"body\": \"Adding comment through rest api\",\r\n" + "    \"visibility\": {\r\n"
						+ "        \"type\": \"role\",\r\n" + "        \"value\": \"Administrators\"\r\n" + "    }\r\n"
						+ "}")
				.when().filter(sessionFilter).post("/rest/api/2/issue/{key}/comment").then().log().all().assertThat()
				.statusCode(201);
	}
	
	@Test
	public void jiraApiTestingGetComment() {

		baseURI = "http://localhost:8080/";
		SessionFilter sessionFilter = new SessionFilter();
		given().log().all().header("Content-Type", "application/json")
				.body("{ \"username\": \"rohanrmahadar\", \"password\": \"Rohan@1508\" }").when().filter(sessionFilter)
				.post("/rest/auth/1/session").then().log().all().assertThat().statusCode(200);

		
		String issueDetails=given().log().all().pathParam("key", "10101").queryParam("fields", "comment")			
				.when().filter(sessionFilter).post("/rest/api/2/issue/{key}").then().log().all().extract().response().asString();
		System.out.println(issueDetails);
	}

	//@Test
	public void jiraApiTestingAddAttachment() {

		baseURI = "http://localhost:8080/";
		SessionFilter sessionFilter = new SessionFilter();
		given().log().all().header("Content-Type", "application/json")
				.body("{ \"username\": \"rohanrmahadar\", \"password\": \"Rohan@1508\" }").when().filter(sessionFilter)
				.post("/rest/auth/1/session").then().log().all().assertThat().statusCode(200);

		given().log().all().header("X-Atlassian-Token", "no-check").pathParam("key", "10101")
				.header("Content-Type", "multipart/form-data")
				.multiPart("file", new File("G:\\Rohan\\automation\\rest-assured\\Files\\xyz.txt")).when()
				.filter(sessionFilter).post("/rest/api/2/issue/{key}/attachments").then().log().all()
				.assertThat().statusCode(200);
	}
}
