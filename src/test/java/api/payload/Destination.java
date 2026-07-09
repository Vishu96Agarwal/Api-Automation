package api.payload;

import java.util.List;
import java.util.Map;

public class Destination {

    private String name;
    private boolean isActive;
    private String region;
    private String country;
    private String description;
    private String htmlToursDescription;
    private List<String> bestMonths;
    private List<String> destinationType;
    private boolean isTrending;
    private int priority;
    private String status;
    private List<String> media;
    private List<String> faq;
    private Map<String, Object> meta;
    private Map<String, Object> structured_data;
    private boolean isVisaApplicable;
    private String visaType;
    private String modeOfApplication;
    private String processingTime;
    private String visaFee;
    private String visaValidity;
    private String documentsRequired;
    private double childPriceRatio;
    private double infantPriceRatio;

    public Destination() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHtmlToursDescription() {
        return htmlToursDescription;
    }

    public void setHtmlToursDescription(String htmlToursDescription) {
        this.htmlToursDescription = htmlToursDescription;
    }

    public List<String> getBestMonths() {
        return bestMonths;
    }

    public void setBestMonths(List<String> bestMonths) {
        this.bestMonths = bestMonths;
    }

    public List<String> getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(List<String> destinationType) {
        this.destinationType = destinationType;
    }

    public boolean isTrending() {
        return isTrending;
    }

    public void setTrending(boolean trending) {
        isTrending = trending;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getMedia() {
        return media;
    }

    public void setMedia(List<String> media) {
        this.media = media;
    }

    public List<String> getFaq() {
        return faq;
    }

    public void setFaq(List<String> faq) {
        this.faq = faq;
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

    public boolean isVisaApplicable() {
        return isVisaApplicable;
    }

    public void setVisaApplicable(boolean visaApplicable) {
        isVisaApplicable = visaApplicable;
    }

    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public String getModeOfApplication() {
        return modeOfApplication;
    }

    public void setModeOfApplication(String modeOfApplication) {
        this.modeOfApplication = modeOfApplication;
    }

    public String getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime;
    }

    public String getVisaFee() {
        return visaFee;
    }

    public void setVisaFee(String visaFee) {
        this.visaFee = visaFee;
    }

    public String getVisaValidity() {
        return visaValidity;
    }

    public void setVisaValidity(String visaValidity) {
        this.visaValidity = visaValidity;
    }

    public String getDocumentsRequired() {
        return documentsRequired;
    }

    public void setDocumentsRequired(String documentsRequired) {
        this.documentsRequired = documentsRequired;
    }

    public double getChildPriceRatio() {
        return childPriceRatio;
    }

    public void setChildPriceRatio(double childPriceRatio) {
        this.childPriceRatio = childPriceRatio;
    }

    public double getInfantPriceRatio() {
        return infantPriceRatio;
    }

    public void setInfantPriceRatio(double infantPriceRatio) {
        this.infantPriceRatio = infantPriceRatio;
    }
}