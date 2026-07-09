package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.Review;

public class ReviewEndpoints {
	
	public static Response create_Review(Review payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_review);
		
		return response;
				
	}
	

	public static Response get_Review()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_review);
		
		return response;
				
	}
	
	public static Response Review(String ReviewId )
	{
		Response response = given()
				.pathParam("id",ReviewId)
				
				.when()
				.get(Routes.get_review_id);
		
		return response;
				
	}
	

	public static Response update_Review_id(String ReviewId ,Review payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id",ReviewId)
				.body(payload)
				
				.when()
				.patch(Routes.update_review_id);
		
		return response;
				
	}
	
	public static Response delete_Review_id(String ReviewId )
	{
		Response response = given()
				.pathParam("id",ReviewId)
				
				.when()
				.delete(Routes.delete_review_id);
		
		return response;
				
	}

}
