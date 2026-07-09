package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.Attraction;

public class AttractionEndpoints {
	
	public static Response create_Attraction(Attraction payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_attraction);
		
		return response;
				
	}
	

	public static Response get_Attraction()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_attraction);
		
		return response;
				
	}
	
	public static Response get_Attraction_id(String AttractionId )
	{
		Response response = given()
				.pathParam("id",AttractionId)
				
				.when()
				.get(Routes.get_attraction_id);
		
		return response;
				
	}
	

	public static Response update_Attraction_id(String AttractionId ,Attraction payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id",AttractionId)
				.body(payload)
				
				.when()
				.patch(Routes.update_attraction_id);
		
		return response;
				
	}
	
	public static Response delete_Attraction_id(String AttractionId )
	{
		Response response = given()
				.pathParam("id",AttractionId)
				
				.when()
				.delete(Routes.delete_attraction_id);
		
		return response;
				
	}

}
