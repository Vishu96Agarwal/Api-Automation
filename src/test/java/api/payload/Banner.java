package api.payload;

import java.util.List;

public class Banner {

    private String image;
    private String redirectUrl;
    private String type;
    private String bannerType;
    private List<String> targetPages;
    private boolean status;
    private int priority;

    // Default Constructor
    public Banner() {
    }

    // Getters and Setters

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBannerType() {
        return bannerType;
    }

    public void setBannerType(String bannerType) {
        this.bannerType = bannerType;
    }

    public List<String> getTargetPages() {
        return targetPages;
    }

    public void setTargetPages(List<String> targetPages) {
        this.targetPages = targetPages;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}