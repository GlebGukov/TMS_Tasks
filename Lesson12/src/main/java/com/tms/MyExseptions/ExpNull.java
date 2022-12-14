package com.tms.MyExseptions;

public class ExpNull extends NullPointerException{
    @Override
    public String getMessage() {
        return "Задано пустое значение";
    }
}
