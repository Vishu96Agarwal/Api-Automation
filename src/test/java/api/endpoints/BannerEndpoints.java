package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.Banner;

public class BannerEndpoints {
	
	public static Response create_Banner(Banner payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_Banners);
		
		return response;
				
	}
	

	public static Response get_Banner()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_Banners);
		
		return response;
				
	}
	
	public static Response get_Banner_id(String BannerId )
	{
		Response response = given()
				.pathParam("id",BannerId)
				
				.when()
				.get(Routes.get_Banners_id);
		
		return response;
				
	}
	

	public static Response update_Banner_id(String BannerId ,Banner payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id",BannerId)
				.body(payload)
				
				.when()
				.patch(Routes.update_Banners_id);
		
		return response;
				
	}
	
	public static Response delete_Banner_id(String BannerId )
	{
		Response response = given()
				.pathParam("id",BannerId)
				
				.when()
				.delete(Routes.delete_Banners_id);
		
		return response;
				
	}

}
