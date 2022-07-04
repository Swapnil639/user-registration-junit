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
        boolean output = userRegistration.validateFirstName("swappy");
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
    @Test
    public void validEmailValidationTest(){
        boolean output1 = userRegistration.validateEmail("abc@yahoo.com");
        Assert.assertTrue(output1);
        boolean output2 = userRegistration.validateEmail("abc-100@yahoo.com");
        Assert.assertTrue(output2);
        boolean output3 = userRegistration.validateEmail("abc.100@yahoo.com");
        Assert.assertTrue(output3);
        boolean output4 = userRegistration.validateEmail("abc111@abc.com");
        Assert.assertTrue(output4);
        boolean output5 = userRegistration.validateEmail("abc-100@abc.net");
        Assert.assertTrue(output5);
        boolean output6 = userRegistration.validateEmail("abc@1.com");
        Assert.assertTrue(output6);
        boolean output7 = userRegistration.validateEmail("abc+100@gmail.com");
        Assert.assertTrue(output7);
    }

    @Test
    public void invalidEmailValidationTest(){
        boolean output1 = userRegistration.validateEmail("abc");
        Assert.assertFalse(output1);
        boolean output2 = userRegistration.validateEmail("abc@.com.my");
        Assert.assertFalse(output2);
        boolean output3 = userRegistration.validateEmail("abc123@gmail.a");
        Assert.assertFalse(output3);
        boolean output4 = userRegistration.validateEmail("abc123@.com");
        Assert.assertFalse(output4);
        boolean output5 = userRegistration.validateEmail("abc123@.com.com");
        Assert.assertFalse(output5);
        boolean output6 = userRegistration.validateEmail("abc@abc..com");
        Assert.assertFalse(output6);
        boolean output7 = userRegistration.validateEmail("abc()*@gmail.com");
        Assert.assertFalse(output7);
        boolean output8 = userRegistration.validateEmail("abc@%*.com");
        Assert.assertFalse(output8);
        boolean output9 = userRegistration.validateEmail("abc..2002@gmail.com");
        Assert.assertFalse(output9);
        boolean output10 = userRegistration.validateEmail("abc.@gmail.com");
        Assert.assertFalse(output10);
        boolean output11 = userRegistration.validateEmail("abc@abc@gmail.com");
        Assert.assertFalse(output11);
        boolean output12 = userRegistration.validateEmail("abc@gamil.com.1a");
        Assert.assertFalse(output12);
        boolean output13 = userRegistration.validateEmail("abc@gmail.com.aa.au");
        Assert.assertFalse(output13);
    }

}
