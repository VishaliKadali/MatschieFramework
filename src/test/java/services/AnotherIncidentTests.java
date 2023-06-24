package services;

import static org.hamcrest.Matchers.containsString;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AnotherIncidentTests extends BaseRequest{
	
	
	@Test
	public void getIncidents(){
		request
			.contentType(ContentType.JSON)
			.get("incident")
			.then()
			.assertThat()
			.statusCode(200)
			.body(containsString("number"),containsString("sys_id"))
			/*.extract().response()
			.prettyPrint()*/;	
	}
	
	@Test
	public void CreateIncidents(){
		request
			.contentType(ContentType.JSON)
			.post("incident")
			.then()
			.assertThat()
			.statusCode(201)
			.body(containsString("number"),containsString("sys_id"))
			/*.extract().response()
			.prettyPrint()*/;	
	}
}
