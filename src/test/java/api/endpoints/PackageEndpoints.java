package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.Package;

public class PackageEndpoints {
	
	public static Response create_Package(Package payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_package);
		
		return response;
				
	}
	

	public static Response get_Package()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_package);
		
		return response;
				
	}
	
	public static Response Package(String PackageId )
	{
		Response response = given()
				.pathParam("id",PackageId)
				
				.when()
				.get(Routes.get_package_id);
		
		return response;
				
	}
	

	public static Response update_Package_id(String PackageId ,Package payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id",PackageId)
				.body(payload)
				
				.when()
				.patch(Routes.update_package_id);
		
		return response;
				
	}
	
	public static Response delete_Package_id(String PackageId )
	{
		Response response = given()
				.pathParam("id",PackageId)
				
				.when()
				.delete(Routes.delete_package_id);
		
		return response;
				
	}

}
