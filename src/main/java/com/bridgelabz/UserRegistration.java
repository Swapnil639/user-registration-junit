package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        if (Pattern.matches("[A-Z][a-z A-Z]{2,}", firstName))
            return true;
        else
            throw new UserRegistrationException("Invalid First Name");
    }

    public boolean validateLastname(String lastName) throws UserRegistrationException{
        if (Pattern.matches("[A-Z][a-z A-Z]{2,}", lastName))
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");

    }

    public boolean validateEmail(String email) throws UserRegistrationException {
        if (Pattern.matches("[\\w+-]+(?:\\.[\\w+-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}", email))
            return true;
        else
            throw new UserRegistrationException("Invalid Email");
    }


    public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException {
        if (Pattern.matches("[+]91 [6-9]\\d{9}", mobileNumber))
            return true;
        else
            throw new UserRegistrationException("Invalid mobile number");
    }


    public boolean validatePassword(String password) throws UserRegistrationException {
        if (Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z \\d $&+,:;=?@#|'<>.-^*()%!]{8,}", password))
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    }

}
