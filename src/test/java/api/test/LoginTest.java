package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import api.endpoints.LoginEndpoint;
import api.payload.User;
import io.restassured.response.Response;

public class LoginTest {

    User userPayload;

    @BeforeMethod
    public void setup() {

        userPayload = new User();
    }

    // ==========================
    // Positive Test Case
    // ==========================

    @Test(priority = 1)
    public void testLoginWithValidCredentials() {

        userPayload.setEmail("super-admin@viacation.com");
        userPayload.setPassword("Viacation@WEB2025");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    // ==========================
    // Negative Test Cases
    // ==========================

    @Test(priority = 2)
    public void testLoginWithInvalidEmail() {

        userPayload.setEmail("wrong@gmail.com");
        userPayload.setPassword("Password@123");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 422);
    }

    @Test(priority = 3)
    public void testLoginWithInvalidPassword() {

        userPayload.setEmail("validuser@gmail.com");
        userPayload.setPassword("WrongPassword");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 422);
    }

    @Test(priority = 4)
    public void testLoginWithBlankEmail() {

        userPayload.setEmail("");
        userPayload.setPassword("Password@123");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 422);
    }

    @Test(priority = 5)
    public void testLoginWithBlankPassword() {

        userPayload.setEmail("validuser@gmail.com");
        userPayload.setPassword("");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 422);
    }

    @Test(priority = 6)
    public void testLoginWithBlankEmailAndPassword() {

        userPayload.setEmail("");
        userPayload.setPassword("");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 422);
    }

    @Test(priority = 7)
    public void testLoginWithUnregisteredEmail() {

        userPayload.setEmail("nouser@gmail.com");
        userPayload.setPassword("Password@123");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 422);
    }

    // ==========================
    // Edge Test Cases
    // ==========================

    @Test(priority = 8)
    public void testLoginWithEmailHavingLeadingSpaces() {

        userPayload.setEmail("  super-admin@viacation.com");
        userPayload.setPassword("Viacation@WEB2025");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();
        
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 9)
    public void testLoginWithEmailHavingTrailingSpaces() {

        userPayload.setEmail("super-admin@viacation.com  ");
        userPayload.setPassword("Viacation@WEB2025");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();
        
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 10)
    public void testLoginWithVeryLongPassword() {

        userPayload.setEmail("validuser@gmail.com");

        userPayload.setPassword(
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();
        
        Assert.assertEquals(response.getStatusCode(), 422);
    }

    @Test(priority = 11)
    public void testLoginWithSpecialCharactersInPassword() {

        userPayload.setEmail("validuser@gmail.com");
        userPayload.setPassword("@#$%^&*()");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();
        
        Assert.assertEquals(response.getStatusCode(), 422);
    }

    @Test(priority = 12)
    public void testLoginWithNullEmail() {

        userPayload.setEmail(null);
        userPayload.setPassword("Password@123");

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();
        
        Assert.assertEquals(response.getStatusCode(), 422);
    }

    @Test(priority = 13)
    public void testLoginWithNullPassword() {

        userPayload.setEmail("validuser@gmail.com");
        userPayload.setPassword(null);

        Response response = LoginEndpoint.Login(userPayload);

        response.then().log().all();
        
        Assert.assertEquals(response.getStatusCode(), 422);
    }
}