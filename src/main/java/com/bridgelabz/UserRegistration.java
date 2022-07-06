package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserDetailsValidationFI {
    boolean validate(String x) throws UserRegistrationException;
}

public class UserRegistration {
    UserDetailsValidationFI validateFirstName = firstName -> {
        // regex pattern for firstname
        if (Pattern.matches("[A-Z][a-z A-Z]{2,}", firstName))
            return true;
        else
            throw new UserRegistrationException("Invalid First Name");
    };

    UserDetailsValidationFI validateLastName = lastName -> {
        if (Pattern.matches("[A-Z][a-z A-Z]{2,}", lastName))
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");
    };

    UserDetailsValidationFI validateEmail = email -> {
        if (Pattern.matches("[\\w+-]+(?:\\.[\\w+-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}", email))
            return true;
        else
            throw new UserRegistrationException("Invalid Email");
    };

    UserDetailsValidationFI validateMobileNumber = mobileNumber -> {
        if (Pattern.matches("[+]91 [6-9]\\d{9}", mobileNumber))
            return true;
        else
            throw new UserRegistrationException("Invalid Mobile Number");
    };

    UserDetailsValidationFI validatePassword = password -> {
        if (Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z \\d $&+,:;=?@#|'<>.-^*()%!]{8,}", password))
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    };
}
