package com.userRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    UserRegistration userregistration = new UserRegistration();

    //TEST TO CHECK  FIRST NAME VALID
    @Test
    public void givenFirstName_whenFirstLetterCapital_thenReturnTrue() {
        String name = "Tanuja";
        boolean firstName = userregistration.validateFirstName(name);
        Assert.assertTrue(firstName);
    }

    //TEST TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_whenFirstLetterNotCapital_thenReturnFalse() {
        String name = "tanuja";
        boolean firstName = userregistration.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

    //TEST TO CHECK  LAST NAME VALID
    @Test
    public void givenLastName_whenLastLetterCapital_thenReturnTrue() {
        String name = "Chaugule";
        boolean lastName = userregistration.validateLastName(name);
        Assert.assertTrue(lastName);
    }

    //TEST TO CHECK LAST NAME INVALID
    @Test
    public void givenLastName_whenLastLetterNotCapital_thenReturnFalse() {
        String name = "chaugule";
        boolean lastName = userregistration.validateLastName(name);
        Assert.assertFalse(lastName);
    }

    //TEST TO CHECK  EMAIL ID VALID
    @Test
    public void givenEmailID_whenValid_thenReturnTrue() {
        String emailID = "abc.xyz@bl.co.in";
        boolean emailName = userregistration.validateEmailID(emailID);
        Assert.assertTrue(emailName);
    }

    //TEST TO CHECK EMAIL ID INVALID
    @Test
    public void givenEmailID_whenInvalid_thenReturnFalse() {
        String emailID = "abc";
        boolean emailName = userregistration.validateEmailID(emailID);
        Assert.assertFalse(emailName);
    }

    //TEST TO CHECK MOBILE NUMBER VALID
    @Test
    public void givenMobileNumber_whenValid_thenReturnTrue() {
        String number = "91 9919819801";
        boolean mobileNumber = userregistration.validateMobileNumber(number);
        Assert.assertTrue(mobileNumber);
    }

    //TEST TO CHECK MOBILE NUMBER INVALID
    @Test
    public void givenMobileNumber_whenInvalid_thenReturnFalse() {
        String number = "9919813";
        boolean mobileNumber = userregistration.validateMobileNumber(number);
        Assert.assertFalse(mobileNumber);
    }

    //TEST TO CHECK PASSWORD RULE ONE VALID
    @Test
    public void givenPassword_whenMinimum8Characters_thenReturnTrue() {
        String password = "tanujachaugule";
        boolean passwordOne = userregistration.validatePasswordRuleOne(password);
        Assert.assertTrue(passwordOne);
    }

    //TEST TO CHECK PASSWORD RULE ONE INVALID
    @Test
    public void givenPassword_whenNotMinimum8Characters_thenReturnFalse() {
        String password = "tanuja";
        boolean passwordOne = userregistration.validatePasswordRuleOne(password);
        Assert.assertFalse(passwordOne);
    }

    //TEST TO CHECK PASSWORD RULE TWO VALID
    @Test
    public void givenPassword_whenAtLeast1UpperCase_thenReturnTrue() {
        String password = "Tanujachaugule";
        boolean passwordTwo = userregistration.validatePasswordRuleTwo(password);
        Assert.assertTrue(passwordTwo);
    }
    //TEST TO CHECK PASSWORD RULE TWO INVALID
    @Test
    public void givenPassword_whenNotContainUpperCase_thenReturnFalse() {
        String password = "tanuja";
        boolean passwordTwo = userregistration.validatePasswordRuleTwo(password);
        Assert.assertFalse(passwordTwo);
    }

    //TEST TO CHECK PASSWORD RULE THREE VALID
    @Test
    public void givenPassword_whenAtLeast1Number_thenReturnTrue() {
        String password = "Tanuja12";
        boolean passwordThree= userregistration.validatePasswordRuleThree(password);
        Assert.assertTrue(passwordThree);
    }


    //TEST TO CHECK PASSWORD RULE THREE INVALID
    @Test
    public void givenPassword_whenNotContainNumber_thenReturnFalse() {
        String password = "tanujachaugule";
        boolean passwordThree = userregistration.validatePasswordRuleThree(password);
        Assert.assertFalse(passwordThree);
    }

    //TEST TO CHECK PASSWORD RULE FOURE VALID
    @Test
    public void givenPassword_whenHasSpecialCharacters_thenReturnTrue() {
        String password = "Tanuja#12";
        boolean passwordFoure = userregistration.validatePasswordRuleFour(password);
        Assert.assertTrue(passwordFoure);
    }

    //TEST TO CHECK PASSWORD RULE FOURE INVALID
    @Test
    public void givenPassword_whenNotContainSpecialCharacters_thenReturnFalse() {
        String password = "tanuja123";
        boolean passwordFoure = userregistration.validatePasswordRuleFour(password);
        Assert.assertFalse(passwordFoure);
    }
}