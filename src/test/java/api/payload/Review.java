package api.payload;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Review {

    private String userName;
    private Map<String, Object> type;
    private String destination;

    @JsonProperty("package")
    private String packageId;

    private boolean isUserReview;
    private String user;
    private String userReviewStatus;
    private String userReviewBookingId;
    private String userReviewDestination;
    private String review;
    private int rating;
    private boolean isApproved;
    private boolean isDisplayOnPackage;
    private List<String> media;
    private String reviewDate;

    // Default Constructor
    public Review() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, Object> getType() {
        return type;
    }

    public void setType(Map<String, Object> type) {
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public boolean isUserReview() {
        return isUserReview;
    }

    public void setUserReview(boolean userReview) {
        isUserReview = userReview;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserReviewStatus() {
        return userReviewStatus;
    }

    public void setUserReviewStatus(String userReviewStatus) {
        this.userReviewStatus = userReviewStatus;
    }

    public String getUserReviewBookingId() {
        return userReviewBookingId;
    }

    public void setUserReviewBookingId(String userReviewBookingId) {
        this.userReviewBookingId = userReviewBookingId;
    }

    public String getUserReviewDestination() {
        return userReviewDestination;
    }

    public void setUserReviewDestination(String userReviewDestination) {
        this.userReviewDestination = userReviewDestination;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public boolean isDisplayOnPackage() {
        return isDisplayOnPackage;
    }

    public void setDisplayOnPackage(boolean displayOnPackage) {
        isDisplayOnPackage = displayOnPackage;
    }

    public List<String> getMedia() {
        return media;
    }

    public void setMedia(List<String> media) {
        this.media = media;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }
}