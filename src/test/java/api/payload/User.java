package api.payload;

import java.util.List;
import java.util.Map;

public class User {
	
	String email;
    String password;
    String firstName;
    String lastName;

   Map<String, Object> photo;
    Map<String, Object> role;
    Map<String, Object> status;

    String emailVerifiedAt;
    String countryCode;
    String preferredCurrency;
    String preferredLanguage;
   int loyaltyPoints;
    Map<String, Object> travelPreferences;
    int phoneCode;
    String phoneNumber;
    String phoneVerifiedAt;
    String gender;
    String avatar;
    List<String> media;
    int invalidAttempts;
    String inActiveTill;
    boolean auth2Enabled;
   boolean mfaEnabled;
    String mfaSecret;
    String createdBy;
    String updatedBy;
    boolean deletionRequested;
    String deletionRequestedAt;
   String description;
   String authorSlug;

    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Map<String, Object> getPhoto() {
		return photo;
	}
	public void setPhoto(Map<String, Object> photo) {
		this.photo = photo;
	}
	public Map<String, Object> getRole() {
		return role;
	}
	public void setRole(Map<String, Object> role) {
		this.role = role;
	}
	public Map<String, Object> getStatus() {
		return status;
	}
	public void setStatus(Map<String, Object> status) {
		this.status = status;
	}
	public String getEmailVerifiedAt() {
		return emailVerifiedAt;
	}
	public void setEmailVerifiedAt(String emailVerifiedAt) {
		this.emailVerifiedAt = emailVerifiedAt;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPreferredCurrency() {
		return preferredCurrency;
	}
	public void setPreferredCurrency(String preferredCurrency) {
		this.preferredCurrency = preferredCurrency;
	}
	public String getPreferredLanguage() {
		return preferredLanguage;
	}
	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}
	public int getLoyaltyPoints() {
		return loyaltyPoints;
	}
	public void setLoyaltyPoints(int loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}
	public Map<String, Object> getTravelPreferences() {
		return travelPreferences;
	}
	public void setTravelPreferences(Map<String, Object> travelPreferences) {
		this.travelPreferences = travelPreferences;
	}
	public int getPhoneCode() {
		return phoneCode;
	}
	public void setPhoneCode(int phoneCode) {
		this.phoneCode = phoneCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneVerifiedAt() {
		return phoneVerifiedAt;
	}
	public void setPhoneVerifiedAt(String phoneVerifiedAt) {
		this.phoneVerifiedAt = phoneVerifiedAt;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public List<String> getMedia() {
		return media;
	}
	public void setMedia(List<String> media) {
		this.media = media;
	}
	public int getInvalidAttempts() {
		return invalidAttempts;
	}
	public void setInvalidAttempts(int invalidAttempts) {
		this.invalidAttempts = invalidAttempts;
	}
	public String getInActiveTill() {
		return inActiveTill;
	}
	public void setInActiveTill(String inActiveTill) {
		this.inActiveTill = inActiveTill;
	}
	public boolean isAuth2Enabled() {
		return auth2Enabled;
	}
	public void setAuth2Enabled(boolean auth2Enabled) {
		this.auth2Enabled = auth2Enabled;
	}
	public boolean isMfaEnabled() {
		return mfaEnabled;
	}
	public void setMfaEnabled(boolean mfaEnabled) {
		this.mfaEnabled = mfaEnabled;
	}
	public String getMfaSecret() {
		return mfaSecret;
	}
	public void setMfaSecret(String mfaSecret) {
		this.mfaSecret = mfaSecret;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public boolean isDeletionRequested() {
		return deletionRequested;
	}
	public void setDeletionRequested(boolean deletionRequested) {
		this.deletionRequested = deletionRequested;
	}
	public String getDeletionRequestedAt() {
		return deletionRequestedAt;
	}
	public void setDeletionRequestedAt(String deletionRequestedAt) {
		this.deletionRequestedAt = deletionRequestedAt;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthorSlug() {
		return authorSlug;
	}
	public void setAuthorSlug(String authorSlug) {
		this.authorSlug = authorSlug;
	}
	 
}