package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.Route;

public class RouteEndpoints {
	
	public static Response create_Route(Route payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				
				.when()
				.post(Routes.post_route);
		
		return response;
				
	}
	

	public static Response get_Route()
	{
		Response response = given()
				
				.when()
				.get(Routes.get_route);
		
		return response;
				
	}
	
	public static Response Route(String RouteId )
	{
		Response response = given()
				.pathParam("id",RouteId)
				
				.when()
				.get(Routes.get_route_id);
		
		return response;
				
	}
	

	public static Response update_Route_id(String RouteId ,Route payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id",RouteId)
				.body(payload)
				
				.when()
				.patch(Routes.update_route_id);
		
		return response;
				
	}
	
	public static Response delete_Route_id(String RouteId )
	{
		Response response = given()
				.pathParam("id",RouteId)
				
				.when()
				.delete(Routes.delete_route_id);
		
		return response;
				
	}

}
