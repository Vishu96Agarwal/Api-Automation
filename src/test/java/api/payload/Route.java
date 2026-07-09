package api.payload;

import java.util.List;
import java.util.Map;

public class Route {

    private String name;
    private int duration;
    private String destination;
    private List<Map<String, Object>> destinations;
    private boolean isActive;
    private boolean status;

    // Default Constructor
    public Route() {
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Map<String, Object>> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Map<String, Object>> destinations) {
        this.destinations = destinations;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}