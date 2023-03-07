package com.userRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    UserRegistration userregistration = new UserRegistration();

    //TEST TO CHECK  FIRST NAME VALID
    @Test
    public void givenFirstName_whenFirstLetterCapital_thenReturnTrue() throws UserException {
        String name = "Tanuja";
        try {
            boolean firstName = userregistration.validateFirstName(name);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_First_Name, e.type);
        }
    }

    //TEST TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_whenFirstLetterNotCapital_thenReturnFalse() {
        String name = "tanuja";
        try {
            boolean firstName = userregistration.validateFirstName(name);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_First_Name, e.type);
        }
    }

    //TEST TO CHECK  LAST NAME VALID
    @Test
    public void givenLastName_whenLastLetterCapital_thenReturnTrue() {
        String name = "Chaugule";
        try {
            boolean lastName = userregistration.validateLastName(name);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Last_Name, e.type);
        }
    }

    //TEST TO CHECK LAST NAME INVALID
    @Test
    public void givenLastName_whenLastLetterNotCapital_thenReturnFalse() {
        String name = "chaugule";
        try {
            boolean lastName = userregistration.validateLastName(name);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Last_Name, e.type);
        }
    }

    //TEST TO CHECK  EMAIL ID VALID
    @Test
    public void givenEmailID_whenValid_thenReturnTrue() {
        String emailID = "abc.xyz@bl.co.in";
        try {
            boolean emailName = userregistration.validateEmailID(emailID);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Email, e.type);
        }
    }

    //TEST TO CHECK EMAIL ID INVALID
    @Test
    public void givenEmailID_whenInvalid_thenReturnFalse() {
        String emailID = "abc";
        try {
            boolean emailName = userregistration.validateEmailID(emailID);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Email, e.type);
        }
    }

    //TEST TO CHECK MOBILE NUMBER VALID
    @Test
    public void givenMobileNumber_whenValid_thenReturnTrue() {
        String number = "91 9919819801";
        try {
            boolean mobileNumber = userregistration.validateMobileNumber(number);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Mobile, e.type);
        }
    }

    //TEST TO CHECK MOBILE NUMBER INVALID
    @Test
    public void givenMobileNumber_whenInvalid_thenReturnFalse() {
        String number = "9919813";
        try {
            boolean mobileNumber = userregistration.validateMobileNumber(number);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Mobile, e.type);
        }
    }

    //TEST TO CHECK PASSWORD RULE ONE VALID
    @Test
    public void givenPassword_whenMinimum8Characters_thenReturnTrue() {
        String password = "tanujachaugule";
        try {
            boolean passwordOne = userregistration.validatePasswordRuleOne(password);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Password, e.type);
        }
    }

    //TEST TO CHECK PASSWORD RULE ONE INVALID
    @Test
    public void givenPassword_whenNotMinimum8Characters_thenReturnFalse() {
        String password = "tanuja";
        try {
            boolean passwordOne = userregistration.validatePasswordRuleOne(password);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Password, e.type);
        }
    }

    //TEST TO CHECK PASSWORD RULE TWO VALID
    @Test
    public void givenPassword_whenAtLeast1UpperCase_thenReturnTrue() {
        String password = "Tanujachaugule";
        try {
            boolean passwordTwo = userregistration.validatePasswordRuleTwo(password);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Password, e.type);
        }
    }

    //TEST TO CHECK PASSWORD RULE TWO INVALID
    @Test
    public void givenPassword_whenNotContainUpperCase_thenReturnFalse() {
        String password = "tanujachaugule";
        try {
            boolean passwordTwo = userregistration.validatePasswordRuleTwo(password);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Password, e.type);
        }
    }

    //TEST TO CHECK PASSWORD RULE THREE VALID
    @Test
    public void givenPassword_whenAtLeast1Number_thenReturnTrue() {
        String password = "Tanuja12";
        try {
            boolean passwordThree = userregistration.validatePasswordRuleThree(password);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Password, e.type);
        }
    }


    //TEST TO CHECK PASSWORD RULE THREE INVALID
    @Test
    public void givenPassword_whenNotContainNumber_thenReturnFalse() {
        String password = "tanujachaugule";
        try {
            boolean passwordThree = userregistration.validatePasswordRuleThree(password);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Password, e.type);
        }
    }

    //TEST TO CHECK PASSWORD RULE FOURE VALID
    @Test
    public void givenPassword_whenHasSpecialCharacters_thenReturnTrue() {
        String password = "Tanuja#12";
        try {
            boolean passwordFoure = userregistration.validatePasswordRuleFour(password);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Password, e.type);
        }
    }

    //TEST TO CHECK PASSWORD RULE FOURE INVALID
    @Test
    public void givenPassword_whenNotContainSpecialCharacters_thenReturnFalse() {
        String password = "tanuja123";
        try {
            boolean passwordFoure = userregistration.validatePasswordRuleFour(password);
            Assert.assertFalse(passwordFoure);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Password, e.type);
        }
    }
}