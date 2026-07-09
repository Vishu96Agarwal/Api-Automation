package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.CustomPackage;

public class CustomPackagesEndpoints {
	
	public static Response create_CustomPackages(CustomPackage payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_custom_packages);
		
		return response;
				
	}
	

	public static Response get_CustomPackage()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_custom_packages);
		
		return response;
				
	}
	
	public static Response get_CustomPackage_id(String CustomPackageId )
	{
		Response response = given()
				.pathParam("id",CustomPackageId)
				
				.when()
				.get(Routes.get_custom_packages_id);
		
		return response;
				
	}
	

	public static Response update_CustomPackage_id(String CustomPackageId ,CustomPackage payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id",CustomPackageId)
				.body(payload)
				
				.when()
				.patch(Routes.update_custom_packages_id);
		
		return response;
				
	}
	
	public static Response delete_CustomPackage_id(String CustomPackageId )
	{
		Response response = given()
				.pathParam("id",CustomPackageId)
				
				.when()
				.delete(Routes.delete_custom_packages_id);
		
		return response;
				
	}

}
