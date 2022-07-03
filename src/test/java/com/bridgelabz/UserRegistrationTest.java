package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    public UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstNameTestReturnTrue(){
        boolean output = userRegistration.validateFirstName("Swapnil");
        Assert.assertTrue(output);
    }
    @Test
    public void validateFirstNameTestReturnFalse(){
        boolean output = userRegistration.validateFirstName("swapnil");
        Assert.assertFalse(output);
    }
    @Test
    public void validateLastNameTestReturnTrue(){
        boolean output = userRegistration.validateLastName("Patil");
        Assert.assertTrue(output);
    }
    @Test
    public void validateLastNameTestReturnFalse(){
        boolean output = userRegistration.validateLastName("patil");
        Assert.assertFalse(output);
    }
    @Test
    public void validateEmailTestReturnTrue() {
        boolean output = userRegistration.validateEmail("swapnilpatil631997@gmail.com");
        Assert.assertTrue(output);
    }
    @Test
    public void validateEmailTestReturnFalse() {
        boolean output = userRegistration.validateEmail("SwapnilPatil.com");
        Assert.assertFalse(output);
    }
    @Test
    public void validateMobileNumberReturnTrue() {
        boolean output = userRegistration.validateMobileNumber("+91 9967891679");
        Assert.assertTrue(output);
    }@Test
    public void validateMobileNumberReturnFalse() {
        boolean output = userRegistration.validateMobileNumber("9967891679");
        Assert.assertFalse(output);
    }
    @Test
    public void validatePasswordReturnTrue() {
        boolean output = userRegistration.validatePassword("SuccessKey639");
        Assert.assertTrue(output);
    }
    @Test
    public void validatePasswordReturnFalse() {
        boolean output = userRegistration.validatePassword("successkey123");
        Assert.assertFalse(output);
    }

}
