package com.userRegistration;

public class UserException extends Exception{
    enum ExceptionType {
        Invalid_First_Name, Invalid_Last_Name, Invalid_Email, Invalid_Mobile, Invalid_Password ;
    }

    ExceptionType type;
    public UserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
