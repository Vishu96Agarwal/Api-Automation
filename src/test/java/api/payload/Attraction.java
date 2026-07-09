package api.payload;

import java.util.List;
import java.util.Map;

public class Attraction {

    private String title;
    private String destination;
    private String type;
    private String activity;
    private String description;

    private List<String> highlights;
    private List<String> media;
    private boolean isActive;
    private List<String> customRules;

    private List<Map<String, Object>> timings;
    private List<Map<String, Object>> pointsOfInterest;

    private Map<String, Object> location;
    private String slug;
    private Map<String, Object> meta;
    private Map<String, Object> structured_data;

    public Attraction() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }

    public List<String> getMedia() {
        return media;
    }

    public void setMedia(List<String> media) {
        this.media = media;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<String> getCustomRules() {
        return customRules;
    }

    public void setCustomRules(List<String> customRules) {
        this.customRules = customRules;
    }

    public List<Map<String, Object>> getTimings() {
        return timings;
    }

    public void setTimings(List<Map<String, Object>> timings) {
        this.timings = timings;
    }

    public List<Map<String, Object>> getPointsOfInterest() {
        return pointsOfInterest;
    }

    public void setPointsOfInterest(List<Map<String, Object>> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    public Map<String, Object> getLocation() {
        return location;
    }

    public void setLocation(Map<String, Object> location) {
        this.location = location;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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
}