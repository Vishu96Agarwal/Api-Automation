package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class UserEndpoints {
	
	public static Response create_User(User payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_user);
		
		return response;
				
	}
	

	public static Response get_User()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_user);
		
		return response;
				
	}
	
	public static Response get_User_id(String UserId )
	{
		Response response = given()
				.pathParam("user-id",UserId)
				
				.when()
				.get(Routes.get_user_id);
		
		return response;
				
	}
	

	public static Response update_User_id(String UserId ,User payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("user-id",UserId)
				.body(payload)
				
				.when()
				.patch(Routes.update_user_id);
		
		return response;
				
	}
	
	public static Response delete_User_id(String UserId )
	{
		Response response = given()
				.pathParam("user-id",UserId)
				
				.when()
				.delete(Routes.delete_user_id);
		
		return response;
				
	}

}
