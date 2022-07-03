package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String firstName){
        return Pattern.matches("[A-Z][A-Z a-z]{2,}",firstName);
    }
    public boolean validateLastName(String lastName){
        return Pattern.matches("[A-Z][A-Z a-z]{2,}",lastName);
    }
    public boolean validateEmail(String email){
        return Pattern.matches("[a-z][A-Z a-z 0-9]+[@][a-z]+[.][a-z]{2,5}",email);
    }
    public boolean validateMobileNumber(String mobileNumber){
        return Pattern.matches("[+]91 [6-9]\\d{9}",mobileNumber);
    }
    public boolean validatePassword(String password){
        return Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z 0-9 $&+,:;=?@#|'<>.-^*()%!]{8,}",password);
    }

}
