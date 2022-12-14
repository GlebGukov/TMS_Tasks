package com.tms.MyExseptions;

public class ExpIndex extends StringIndexOutOfBoundsException{
    @Override
    public String getMessage() {
        return "Не верное значение";
    }
}
