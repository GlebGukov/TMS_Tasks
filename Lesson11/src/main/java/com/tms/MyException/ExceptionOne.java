package com.tms.MyException;

public class ExceptionOne extends NullPointerException{
    @Override
    public String getMessage() {
        return "Задано пустое значение";
    }
}

