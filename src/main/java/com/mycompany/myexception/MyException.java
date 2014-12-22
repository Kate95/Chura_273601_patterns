package com.mycompany.myexception;

public class MyException extends Exception {

    public MyException(){}
    
    @Override
    public String getMessage() {
        return "Such type of chess can not be created";
    }
}
