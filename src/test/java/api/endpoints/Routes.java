package api.endpoints;

public class Routes {
	
	public static String base_url = "https://api.dev.viacation.com/v1";
	
	// User
	
	public static String post_user = base_url+"/users/admin";
	public static String get_user = base_url+"/users";
	public static String get_user_id = base_url+"/users/{user-id}";
	public static String update_user_id = base_url+"/users/{user-id}";
	public static String delete_user_id = base_url+"/users/{user-id}";
	
	// Auth Login
	
	public static String login = base_url+"/auth/email/login";
	
	

}
