package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void validateFirstNameTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateFirstName.validate("Swapnil");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateFirstNameTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateFirstName.validate("swapnil");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid First Name", exception.getMessage());
        }

    }

    @Test
    public void validateLastNameTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateLastName.validate("Patil");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateLastNameTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateLastName.validate("patil");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Last Name", exception.getMessage());
        }
    }

    @Test
    public void validateEmailTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateEmail.validate("swapnilpatil631997@gmail.com");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateEmailTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateEmail.validate("abc@@in.");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Email", exception.getMessage());
        }
    }

    @Test
    public void validateMobileNumberReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateMobileNumber.validate("+91 9967891679");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateMobileNumberReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateMobileNumber.validate("+91996789");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Mobile Number", exception.getMessage());
        }
    }

    @Test
    public void validatePasswordReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validatePassword.validate("Successkey@123");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validatePasswordReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validatePassword.validate("swap@.");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Password", exception.getMessage());
        }
    }
}