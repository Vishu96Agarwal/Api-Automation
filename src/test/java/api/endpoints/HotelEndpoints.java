package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.Hotel;

public class HotelEndpoints {
	
	public static Response create_Hotel(Hotel payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_hotel);
		
		return response;
				
	}
	

	public static Response get_Hotel()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_hotel);
		
		return response;
				
	}
	
	public static Response get_Hotel_id(String HotelId )
	{
		Response response = given()
				.pathParam("id",HotelId)
				
				.when()
				.get(Routes.get_hotel_id);
		
		return response;
				
	}
	

	public static Response update_Hotel_id(String HotelId ,Hotel payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id",HotelId)
				.body(payload)
				
				.when()
				.patch(Routes.update_hotel_id);
		
		return response;
				
	}
	
	public static Response delete_Hotel_id(String HotelId )
	{
		Response response = given()
				.pathParam("id",HotelId)
				
				.when()
				.delete(Routes.delete_hotel_id);
		
		return response;
				
	}

}
