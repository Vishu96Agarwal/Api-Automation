package api.endpoints;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class WebsiteEndpoints {
	
	public static Response get_Home()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_home);
		
		return response;
				
	}
	
	public static Response get_Footer()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_footer);
		
		return response;
				
	}
	
	public static Response get_Search(String query)
	{
		Response response = given()
			     .queryParam("query", query)
				
				.when()
				.get(Routes.get_search);
		
		return response;
				
	}
	
	public static Response get_Package_Detail()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_package_detail);
		
		return response;
				
	}
	
	public static Response get_Destination_Detail()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_destination_detail);
		
		return response;
				
	}
	
	public static Response get_Header()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_header);
		
		return response;
				
	}
	
	public static Response get_Tours()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_tours);
		
		return response;
				
	}
	
	public static Response get_Route_Builder()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_route_builder);
		
		return response;
				
	}
	
	public static Response get_findAllBlogs()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_findAllBlogs);
		
		return response;
				
	}

}
