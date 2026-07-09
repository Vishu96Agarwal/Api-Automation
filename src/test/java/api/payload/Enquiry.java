package api.payload;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Enquiry {

    private String status;

    @JsonProperty("package")
    private String packageId;

    private String travelDate;

    private Map<String, Object> utmData;

    // Default Constructor
    public Enquiry() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public Map<String, Object> getUtmData() {
        return utmData;
    }

    public void setUtmData(Map<String, Object> utmData) {
        this.utmData = utmData;
    }
}