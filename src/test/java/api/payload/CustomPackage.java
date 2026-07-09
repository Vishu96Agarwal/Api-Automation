package api.payload;

import java.util.List;
import java.util.Map;

public class CustomPackage {

    private int phoneCode;
    private String phone;
    private String userName;
    private String packag;
    private String customPackageName;
    private List<Map<String, Object>> customPkgDayWiseDetails;
    private double totalPrice;
    private double advanceBookingPrice;
    private String travelDate;
    private int numAdults;
    private int numChildren;
    private int numInfants;
    private double pricePerAdult;
    private double pricePerChild;
    private double pricePerInfant;
    private String status;
    private String paymentUrl;
    private String paymentUrlExpiry;

    // Default Constructor
    public CustomPackage() {
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // package is a reserved keyword in Java
    public String getPackag() {
        return packag;
    }

    public void setPackag(String packag) {
        this.packag = packag;
    }

    public String getCustomPackageName() {
        return customPackageName;
    }

    public void setCustomPackageName(String customPackageName) {
        this.customPackageName = customPackageName;
    }

    public List<Map<String, Object>> getCustomPkgDayWiseDetails() {
        return customPkgDayWiseDetails;
    }

    public void setCustomPkgDayWiseDetails(List<Map<String, Object>> customPkgDayWiseDetails) {
        this.customPkgDayWiseDetails = customPkgDayWiseDetails;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getAdvanceBookingPrice() {
        return advanceBookingPrice;
    }

    public void setAdvanceBookingPrice(double advanceBookingPrice) {
        this.advanceBookingPrice = advanceBookingPrice;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(int numAdults) {
        this.numAdults = numAdults;
    }

    public int getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }

    public int getNumInfants() {
        return numInfants;
    }

    public void setNumInfants(int numInfants) {
        this.numInfants = numInfants;
    }

    public double getPricePerAdult() {
        return pricePerAdult;
    }

    public void setPricePerAdult(double pricePerAdult) {
        this.pricePerAdult = pricePerAdult;
    }

    public double getPricePerChild() {
        return pricePerChild;
    }

    public void setPricePerChild(double pricePerChild) {
        this.pricePerChild = pricePerChild;
    }

    public double getPricePerInfant() {
        return pricePerInfant;
    }

    public void setPricePerInfant(double pricePerInfant) {
        this.pricePerInfant = pricePerInfant;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentUrl() {
        return paymentUrl;
    }

    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    public String getPaymentUrlExpiry() {
        return paymentUrlExpiry;
    }

    public void setPaymentUrlExpiry(String paymentUrlExpiry) {
        this.paymentUrlExpiry = paymentUrlExpiry;
    }
}