package com.userRegistration;

import java.util.regex.Pattern;
public class UserRegistration {
    String firstNamePattern = "^[A-Z]{1}[ a-z]{2,25}";
    String lastNamePattern = "^[A-Z]{1}[ a-z]{2,25}";
    String emailPattern = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
    String mobilePattern = "((91){1})[ ]([98765]{1})([0-9]{9})$";
    String passwordPatternFirstRule = "[a-zA-z]{8,32}$";
    String passwordPatternSecondRule = "(?=.*[A-Z])[a-zA-Z]{8,32}$";
    String passwordPatternThreeRule = "(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,32}$";
    String passwordPatternFourRule = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!?#$]{1})[a-zA-Z0-9!?#$]{8,32}$";
    String sampleEmailPattern = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";


    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Validation");
    }

    public boolean validateFirstName(String firstName) throws UserException {
        if (Pattern.matches(firstNamePattern, firstName)) {
            return true;
        } else {
            throw new UserException("Invalid First Name", UserException.ExceptionType.Invalid_First_Name);
        }
    }

    public boolean validateLastName(String lastName) throws UserException {
        if (Pattern.matches(lastNamePattern,lastName)) {
            return true;
        } else {
            throw new UserException("Invalid Last Name", UserException.ExceptionType.Invalid_Last_Name);
        }
    }

    public boolean validateEmailID(String emailID) throws UserException {
        if (Pattern.matches(emailPattern,emailID)) {
            return true;
        } else {
            throw new UserException("Invalid Email ID", UserException.ExceptionType.Invalid_Email);
        }
    }

    public boolean validateMobileNumber(String mobileNumber) throws UserException {
        if (Pattern.matches(mobilePattern,mobileNumber)) {
            return true;
        } else {
            throw new UserException("Invalid First Name", UserException.ExceptionType.Invalid_Mobile);
        }
    }

    public boolean validatePasswordRuleOne(String passwordOne) throws UserException {
        if (Pattern.matches(passwordPatternFirstRule,passwordOne)) {
            return true;
        } else {
            throw new UserException("Invalid Password", UserException.ExceptionType.Invalid_Password);
        }
    }

    public boolean validatePasswordRuleTwo(String passwordTwo) throws UserException {
        if (Pattern.matches(passwordPatternSecondRule,passwordTwo)){
            return true;
        } else {
            throw new UserException("Invalid Password", UserException.ExceptionType.Invalid_Password);
        }
    }

    public boolean validatePasswordRuleThree(String passwordThree) throws UserException {
        if (Pattern.matches(passwordPatternThreeRule,passwordThree)) {
            return true;
        } else {
            throw new UserException("Invalid Password", UserException.ExceptionType.Invalid_Password);
        }
    }

    public boolean validatePasswordRuleFour(String passwordFour) throws UserException {
        if (Pattern.matches(passwordPatternFourRule,passwordFour)) {
            return true;
        } else {
            throw new UserException("Invalid Password", UserException.ExceptionType.Invalid_Password);
        }
    }

    public boolean validateSampleEmail(String email) {

        return (Pattern.matches(sampleEmailPattern,email));
    }
}