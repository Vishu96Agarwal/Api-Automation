package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.Faq;

public class FaqEndpoints {
	
	public static Response create_Faq(Faq payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_faq);
		
		return response;
				
	}
	

	public static Response get_Faq()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_faq);
		
		return response;
				
	}
	
	public static Response get_Faq_id(String FaqId )
	{
		Response response = given()
				.pathParam("id",FaqId)
				
				.when()
				.get(Routes.get_faq_id);
		
		return response;
				
	}
	

	public static Response update_Faq_id(String FaqId ,Faq payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id",FaqId)
				.body(payload)
				
				.when()
				.patch(Routes.update_faq_id);
		
		return response;
				
	}
	
	public static Response delete_Faq_id(String FaqId )
	{
		Response response = given()
				.pathParam("id",FaqId)
				
				.when()
				.delete(Routes.delete_faq_id);
		
		return response;
				
	}

}
