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

    public boolean validateFirstName(String firstName) {
        return (Pattern.matches(firstNamePattern,firstName));
    }

    public boolean validateLastName(String lastName) {
        return (Pattern.matches(lastNamePattern,lastName));
    }

    public boolean validateEmailID(String emailID) {
        return (Pattern.matches(emailPattern,emailID));
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return (Pattern.matches(mobilePattern,mobileNumber));
    }

    public boolean validatePasswordRuleOne(String passwordOne) {
        return (Pattern.matches(passwordPatternFirstRule,passwordOne));
    }

    public boolean validatePasswordRuleTwo(String passwordTwo) {
        return (Pattern.matches(passwordPatternSecondRule,passwordTwo));
    }

    public boolean validatePasswordRuleThree(String passwordThree) {
        return (Pattern.matches(passwordPatternThreeRule,passwordThree));
    }

    public boolean validatePasswordRuleFour(String passwordFour) {
        return (Pattern.matches(passwordPatternFourRule,passwordFour));
    }

    public boolean validateSampleEmail(String email) {

        return (Pattern.matches(sampleEmailPattern,email));
    }

}
