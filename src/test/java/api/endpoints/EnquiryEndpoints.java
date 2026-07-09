package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.Enquiry;

public class EnquiryEndpoints {
	
	public static Response create_Enquiry(Enquiry payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_enquiry);
		
		return response;
				
	}
	

	public static Response get_Enquiry()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_enquiry);
		
		return response;
				
	}
	
	public static Response get_Enquiry_id(String EnquiryId )
	{
		Response response = given()
				.pathParam("id",EnquiryId)
				
				.when()
				.get(Routes.get_enquiry_id);
		
		return response;
				
	}
	

	public static Response update_Enquiry_id(String EnquiryId ,Enquiry payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id",EnquiryId)
				.body(payload)
				
				.when()
				.patch(Routes.update_enquiry_id);
		
		return response;
				
	}
	
	public static Response delete_Enquiry_id(String EnquiryId )
	{
		Response response = given()
				.pathParam("id",EnquiryId)
				
				.when()
				.delete(Routes.delete_enquiry_id);
		
		return response;
				
	}

}
