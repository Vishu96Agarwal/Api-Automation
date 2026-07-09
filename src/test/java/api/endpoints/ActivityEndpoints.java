package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.Activity;

public class ActivityEndpoints {
	
	public static Response create_Activity(Activity payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_activity);
		
		return response;
				
	}
	

	public static Response get_Activity()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_activity);
		
		return response;
				
	}
	
	public static Response get_Activity_id(String ActivityId )
	{
		Response response = given()
				.pathParam("id",ActivityId)
				
				.when()
				.get(Routes.get_activity_id);
		
		return response;
				
	}
	

	public static Response update_Activity_id(String ActivityId ,Activity payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id",ActivityId)
				.body(payload)
				
				.when()
				.patch(Routes.update_activity_id);
		
		return response;
				
	}
	
	public static Response delete_Activity_id(String ActivityId )
	{
		Response response = given()
				.pathParam("id",ActivityId)
				
				.when()
				.delete(Routes.delete_activity_id);
		
		return response;
				
	}

}
