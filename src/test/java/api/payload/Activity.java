package api.payload;

import java.util.List;
import java.util.Map;

public class Activity {

    private String title;
    private String destination;
    private List<String> media;
    private boolean isActive;
    private List<String> attractions;
    private List<Map<String, Object>> extras;

    public Activity() {
    }

    // Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Destination
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    // Media
    public List<String> getMedia() {
        return media;
    }

    public void setMedia(List<String> media) {
        this.media = media;
    }

    // isActive
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // Attractions
    public List<String> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<String> attractions) {
        this.attractions = attractions;
    }

    // Extras
    public List<Map<String, Object>> getExtras() {
        return extras;
    }

    public void setExtras(List<Map<String, Object>> extras) {
        this.extras = extras;
    }

}