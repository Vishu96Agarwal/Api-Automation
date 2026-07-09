package api.payload;

import java.util.Map;

public class RouteBuilder {

    private String title;
    private String toDestination;
    private String fromDestination;
    private String description;
    private boolean isActive;
    private Map<String, Object> meta;
    private Map<String, Object> structured_data;

    // Default Constructor
    public RouteBuilder() {
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getToDestination() {
        return toDestination;
    }

    public void setToDestination(String toDestination) {
        this.toDestination = toDestination;
    }

    public String getFromDestination() {
        return fromDestination;
    }

    public void setFromDestination(String fromDestination) {
        this.fromDestination = fromDestination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
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