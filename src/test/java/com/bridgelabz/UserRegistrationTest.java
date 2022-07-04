package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    public UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstNameTestReturnTrue() {
        try {
            boolean output = userRegistration.validateFirstName("Swapnil");
            Assert.assertTrue(output);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void validateLastNameTestReturnTrue() {
        try {
            boolean output = userRegistration.validateLastname("Patil");
            Assert.assertTrue(output);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void validateEmailTestReturnTrue() {
        try {
            boolean output = userRegistration.validateEmail("swapnilpatil631997@gmail.com");
            Assert.assertTrue(output);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void validateMobileNumberReturnTrue() {
        try {
            boolean output = userRegistration.validateMobileNumber("+91 9967891679");
            Assert.assertTrue(output);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void validatePasswordReturnTrue() {
        try {
            boolean output = userRegistration.validatePassword("Successkey123");
            Assert.assertTrue(output);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
