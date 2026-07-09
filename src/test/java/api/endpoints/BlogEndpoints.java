package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.Blog;

public class BlogEndpoints {
	
	public static Response create_Blog(Blog payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_blog);
		
		return response;
				
	}
	

	public static Response get_Blog()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_blog);
		
		return response;
				
	}
	
	public static Response get_Blog_id(String BlogId )
	{
		Response response = given()
				.pathParam("id",BlogId)
				
				.when()
				.get(Routes.get_blog_id);
		
		return response;
				
	}
	

	public static Response update_Blog_id(String BlogId ,Blog payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id",BlogId)
				.body(payload)
				
				.when()
				.patch(Routes.update_blog_id);
		
		return response;
				
	}
	
	public static Response delete_Blog_id(String BlogId )
	{
		Response response = given()
				.pathParam("id",BlogId)
				
				.when()
				.delete(Routes.delete_blog_id);
		
		return response;
				
	}

}
