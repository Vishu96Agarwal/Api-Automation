package api.endpoints;

public class Routes {
	
	public static String base_url = "https://api.dev.viacation.com/v1";
	
	
	// Auth Login
	
	public static String login = base_url+"/auth/email/login";
		
		
	// User
	
	public static String post_user = base_url+"/users/admin";
	public static String get_user = base_url+"/users";
	public static String get_user_id = base_url+"/users/{user-id}";
	public static String update_user_id = base_url+"/users/{user-id}";
	public static String delete_user_id = base_url+"/users/{user-id}";
	
	
	// destination
	
	public static String post_destination = base_url+"/destinations";
	public static String get_destination = base_url+"/destinations";
	public static String get_destination_id = base_url+"/destinations/{destination-id}";
	public static String update_destination_id = base_url+"/destinations/{destination-id}";
	public static String delete_destination_id = base_url+"/destinations/{destination-id}";
		
		
	// hotel
		
	public static String post_hotel = base_url+"/hotels";
	public static String get_hotel = base_url+"/hotels";
	public static String get_hotel_id = base_url+"/hotels/{id}";
	public static String update_hotel_id = base_url+"/hotels/{id}";
	public static String delete_hotel_id = base_url+"/hotels/{id}";	
	
	
	// Activity
			
	public static String post_activity = base_url+"/activities";
	public static String get_activity = base_url+"/activities";
	public static String get_activity_id = base_url+"/activities/{id}";
	public static String update_activity_id = base_url+"/activities/{id}";
	public static String delete_activity_id = base_url+"activities/{id}";
	
	
	// package
	
	public static String post_package = base_url+"/packages";
	public static String get_package = base_url+"/packages";
	public static String get_package_id = base_url+"/packages/{id}";
	public static String update_package_id = base_url+"/packages/{id}";
	public static String delete_package_id = base_url+"/packages/{id}";	
	
	
	// route
	
	public static String post_route = base_url+"/routes";
	public static String get_route = base_url+"/routes";
	public static String get_route_id = base_url+"/routes/{id}";
	public static String update_route_id = base_url+"/routes/{id}";
	public static String delete_route_id = base_url+"/routes/{id}";	
	
	
	// attractions
	
	public static String post_attraction = base_url+"/attractions";
	public static String get_attraction = base_url+"/attractions";
	public static String get_attraction_id = base_url+"/attractions/{id}";
	public static String update_attraction_id = base_url+"/attractions/{id}";
	public static String delete_attraction_id = base_url+"/attractions/{id}";
	
	
	// enquiry
	
	public static String post_enquiry = base_url+"/enquiry";
	public static String get_enquiry = base_url+"/enquiry";
	public static String get_enquiry_id = base_url+"/enquiry/{id}";
	public static String update_enquiry_id = base_url+"/enquiry/{id}";
	public static String delete_enquiry_id = base_url+"/enquiry/{id}";
	
	
	// custom-packages
	
	public static String post_custom_packages = base_url+"/custom-packages";
	public static String get_custom_packages = base_url+"/custom-packages";
	public static String get_custom_packages_id = base_url+"/custom-packages/{id}";
	public static String update_custom_packages_id = base_url+"/custom-packages/{id}";
	public static String delete_custom_packages_id = base_url+"/custom-packages/{id}";
	
	
	// review
	
	public static String post_review = base_url+"/review";
	public static String get_review = base_url+"/review";
	public static String get_review_id = base_url+"/review/{id}";
	public static String update_review_id = base_url+"/review/{id}";
	public static String delete_review_id = base_url+"/review/{id}";
	
	
	// faq
		
	public static String post_faq = base_url+"/faq";
	public static String get_faq = base_url+"/faq";
	public static String get_faq_id = base_url+"/faq/{id}";
	public static String update_faq_id = base_url+"/faq/{id}";
	public static String delete_faq_id = base_url+"/faq/{id}";
	
	
	// Banners
	
	public static String post_Banners = base_url+"/Banners";
	public static String get_Banners = base_url+"/Banners";
	public static String get_Banners_id = base_url+"/Banners/{id}";
	public static String update_Banners_id = base_url+"/Banners/{id}";
	public static String delete_Banners_id = base_url+"/Banners/{id}";
	
	
	// blogs
	
	public static String post_blog = base_url+"/blogs";
	public static String get_blog = base_url+"/blogs";
	public static String get_blog_id = base_url+"/blogs/{id}";
	public static String update_blog_id = base_url+"/blogs/{id}";
	public static String delete_blog_id = base_url+"/blogs/{id}";
	
	
	// routeBuilders
	
	public static String post_routeBuilders = base_url+"/routeBuilders";
	public static String get_routeBuilders = base_url+"/routeBuilders";
	public static String get_routeBuilders_id = base_url+"/routeBuilders/{id}";
	public static String update_routeBuilders_id = base_url+"/routeBuilders/{id}";
	public static String delete_routeBuilders_id = base_url+"/routeBuilders/{id}";
	
	
	// Website
	
	public static String get_home = base_url+"/home";
	public static String get_footer = base_url+"/footer";
	public static String get_search = base_url+"/home";
	public static String get_package_detail = base_url+"/package";
	public static String get_destination_detail = base_url+"/destination";
	public static String get_header = base_url+"/header";
	public static String get_tours = base_url+"/tours";
	public static String get_route_builder = base_url+"/tour-from";
	public static String get_findAllBlogs = base_url+"/findAllBlogs";
		
	
}
