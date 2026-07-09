package api.payload;

import java.util.List;
import java.util.Map;

public class Package {

     String name;
     public String getName() {
		return name;
	}

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getSlug() {
		 return slug;
	 }

	 public void setSlug(String slug) {
		 this.slug = slug;
	 }

	 public int getDuration() {
		 return duration;
	 }

	 public void setDuration(int duration) {
		 this.duration = duration;
	 }

	 public String getRoute() {
		 return route;
	 }

	 public void setRoute(String route) {
		 this.route = route;
	 }

	 public boolean isGroupTour() {
		 return isGroupTour;
	 }

	 public void setGroupTour(boolean isGroupTour) {
		 this.isGroupTour = isGroupTour;
	 }

	 public boolean isPackageBookable() {
		 return isPackageBookable;
	 }

	 public void setPackageBookable(boolean isPackageBookable) {
		 this.isPackageBookable = isPackageBookable;
	 }

	 public List<String> getStayCategories() {
		 return stayCategories;
	 }

	 public void setStayCategories(List<String> stayCategories) {
		 this.stayCategories = stayCategories;
	 }

	 public Map<String, Object> getPrice() {
		 return price;
	 }

	 public void setPrice(Map<String, Object> price) {
		 this.price = price;
	 }

	 public Map<String, Object> getStrikePrice() {
		 return strikePrice;
	 }

	 public void setStrikePrice(Map<String, Object> strikePrice) {
		 this.strikePrice = strikePrice;
	 }

	 public int getTripDifficulty() {
		 return tripDifficulty;
	 }

	 public void setTripDifficulty(int tripDifficulty) {
		 this.tripDifficulty = tripDifficulty;
	 }

	 public String getDestination() {
		 return destination;
	 }

	 public void setDestination(String destination) {
		 this.destination = destination;
	 }

	 public String getRegion() {
		 return region;
	 }

	 public void setRegion(String region) {
		 this.region = region;
	 }

	 public String getCountry() {
		 return country;
	 }

	 public void setCountry(String country) {
		 this.country = country;
	 }

	 public String getOverview() {
		 return overview;
	 }

	 public void setOverview(String overview) {
		 this.overview = overview;
	 }

	 public List<String> getCategory() {
		 return category;
	 }

	 public void setCategory(List<String> category) {
		 this.category = category;
	 }

	 public List<String> getMedia() {
		 return media;
	 }

	 public void setMedia(List<String> media) {
		 this.media = media;
	 }

	 public List<String> getCustomHighlights() {
		 return customHighlights;
	 }

	 public void setCustomHighlights(List<String> customHighlights) {
		 this.customHighlights = customHighlights;
	 }

	 public List<String> getCustomInclusion() {
		 return customInclusion;
	 }

	 public void setCustomInclusion(List<String> customInclusion) {
		 this.customInclusion = customInclusion;
	 }

	 public List<String> getCustomExclusion() {
		 return customExclusion;
	 }

	 public void setCustomExclusion(List<String> customExclusion) {
		 this.customExclusion = customExclusion;
	 }

	 public List<String> getTripInclusion() {
		 return tripInclusion;
	 }

	 public void setTripInclusion(List<String> tripInclusion) {
		 this.tripInclusion = tripInclusion;
	 }

	 public List<Map<String, Object>> getExtras() {
		 return extras;
	 }

	 public void setExtras(List<Map<String, Object>> extras) {
		 this.extras = extras;
	 }

	 public boolean isPopular() {
		 return isPopular;
	 }

	 public void setPopular(boolean isPopular) {
		 this.isPopular = isPopular;
	 }

	 public boolean isTrending() {
		 return isTrending;
	 }

	 public void setTrending(boolean isTrending) {
		 this.isTrending = isTrending;
	 }

	 public boolean isActive() {
		 return isActive;
	 }

	 public void setActive(boolean isActive) {
		 this.isActive = isActive;
	 }

	 public int getPriority() {
		 return priority;
	 }

	 public void setPriority(int priority) {
		 this.priority = priority;
	 }

	 public int getFlightPrice() {
		 return flightPrice;
	 }

	 public void setFlightPrice(int flightPrice) {
		 this.flightPrice = flightPrice;
	 }

	 public int getCustomPriority() {
		 return customPriority;
	 }

	 public void setCustomPriority(int customPriority) {
		 this.customPriority = customPriority;
	 }

	 public String getStatus() {
		 return status;
	 }

	 public void setStatus(String status) {
		 this.status = status;
	 }

	 public List<Map<String, Object>> getItineraryData() {
		 return itineraryData;
	 }

	 public void setItineraryData(List<Map<String, Object>> itineraryData) {
		 this.itineraryData = itineraryData;
	 }

	 public List<Map<String, Object>> getHeaderInclusion() {
		 return headerInclusion;
	 }

	 public void setHeaderInclusion(List<Map<String, Object>> headerInclusion) {
		 this.headerInclusion = headerInclusion;
	 }

	 public List<String> getTags() {
		 return tags;
	 }

	 public void setTags(List<String> tags) {
		 this.tags = tags;
	 }

	 public Map<String, Object> getStayConfig() {
		 return stayConfig;
	 }

	 public void setStayConfig(Map<String, Object> stayConfig) {
		 this.stayConfig = stayConfig;
	 }

	 public String getExpiryDate() {
		 return expiryDate;
	 }

	 public void setExpiryDate(String expiryDate) {
		 this.expiryDate = expiryDate;
	 }

	 public List<String> getPackageTag() {
		 return packageTag;
	 }

	 public void setPackageTag(List<String> packageTag) {
		 this.packageTag = packageTag;
	 }

	 public Map<String, Object> getMeta() {
		 return meta;
	 }

	 public void setMeta(Map<String, Object> meta) {
		 this.meta = meta;
	 }

	 public Map<String, Object> getStructured_data() {
		 return structured_data;
	 }

	 public void setStructured_data(Map<String, Object> structured_data) {
		 this.structured_data = structured_data;
	 }

	 String slug;
     int duration;
     String route;
     boolean isGroupTour;
     boolean isPackageBookable;
     List<String> stayCategories;

     Map<String, Object> price;
     Map<String, Object> strikePrice;

     int tripDifficulty;
     String destination;
     String region;
     String country;
     String overview;

     List<String> category;
     List<String> media;
     List<String> customHighlights;
     List<String> customInclusion;
     List<String> customExclusion;
     List<String> tripInclusion;

     List<Map<String,Object>> extras;

     boolean isPopular;
     boolean isTrending;
     boolean isActive;

     int priority;
     int flightPrice;
     int customPriority;

     String status;

     List<Map<String,Object>> itineraryData;

     List<Map<String,Object>> headerInclusion;

     List<String> tags;

     Map<String,Object> stayConfig;

     String expiryDate;

     List<String> packageTag;

     Map<String,Object> meta;

     Map<String,Object> structured_data;

    // Generate Constructor
    // Generate Getters and Setters using Eclipse
}