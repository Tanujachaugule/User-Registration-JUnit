package com.userRegistration;

import java.util.regex.Pattern;
interface ValidateFunction {
    boolean validate(String pattern, String userInput);
}
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

    ValidateFunction lambdaPattern = (userInput, pattern) -> {
        boolean result = Pattern.matches(pattern,userInput);
        return result;
    };

    private boolean lambdaPattern(String userInput, String pattern){
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Validation");
    }

    public boolean validateFirstName(String firstName) throws UserException {
        if(lambdaPattern(firstName, firstNamePattern)) {
            return true;
        } else{
            throw new UserException("Invalid First Name", UserException.ExceptionType.Invalid_First_Name);
        }
    }

    public boolean validateLastName(String lastName) throws UserException {
        if(lambdaPattern(lastName,lastNamePattern)) {
            return true;
        } else {
            throw new UserException("Invalid Last Name", UserException.ExceptionType.Invalid_Last_Name);
        }
    }

    public boolean validateEmailID(String emailID) throws UserException {
        if( lambdaPattern(emailID, emailPattern)) {
            return true;
        } else {
            throw new UserException("Invalid Email ID", UserException.ExceptionType.Invalid_Email);
        }
    }

    public boolean validateMobileNumber(String mobileNumber) throws UserException {
        if( lambdaPattern(mobileNumber, mobilePattern)) {
            return true;
        } else {
            throw new UserException("Invalid Mobile Number", UserException.ExceptionType.Invalid_Mobile);
        }
    }

    public boolean validatePasswordRuleOne(String passwordOne) throws UserException {
        if(lambdaPattern(passwordOne, passwordPatternFirstRule)) {
            return true;
        } else {
            throw new UserException("Invalid Password", UserException.ExceptionType.Invalid_Password);
        }

    }

    public boolean validatePasswordRuleTwo(String passwordTwo) throws UserException  {
        if(lambdaPattern(passwordTwo, passwordPatternSecondRule)) {
            return true;
        } else {
            throw new UserException("Invalid Password", UserException.ExceptionType.Invalid_Password);
        }
    }

    public boolean validatePasswordRuleThree(String passwordThree) throws UserException {
        if(lambdaPattern(passwordThree, passwordPatternThreeRule)) {
            return true;
        } else {
            throw new UserException("Invalid Password", UserException.ExceptionType.Invalid_Password);
        }
    }

    public boolean validatePasswordRuleFour(String passwordFour) throws UserException {

        if(lambdaPattern(passwordFour, passwordPatternFourRule)) {
            return true;
        } else {
            throw new UserException("Invalid Password", UserException.ExceptionType.Invalid_Password);
        }
    }

    public boolean validateSampleEmail(String email)  {
        return (Pattern.matches(sampleEmailPattern,email));
    }
}
