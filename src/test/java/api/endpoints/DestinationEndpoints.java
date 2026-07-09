package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.Destination;

public class DestinationEndpoints {
	
	public static Response create_destination(Destination payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_destination);
		
		return response;
				
	}
	

	public static Response get_destination()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_destination);
		
		return response;
				
	}
	
	public static Response get_destination_id(String DestinationId )
	{
		Response response = given()
				.pathParam("destination-id",DestinationId)
				
				.when()
				.get(Routes.get_destination_id);
		
		return response;
				
	}
	

	public static Response update_destination_id(String DestinationId ,Destination payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("destination-id",DestinationId)
				.body(payload)
				
				.when()
				.patch(Routes.update_destination_id);
		
		return response;
				
	}
	
	public static Response delete_destination_id(String DestinationId )
	{
		Response response = given()
				.pathParam("destination-id",DestinationId)
				
				.when()
				.delete(Routes.delete_destination_id);
		
		return response;
				
	}

}
