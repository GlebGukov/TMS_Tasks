package com.tms.MyException;

public class ExpentionThree extends IllegalAccessException{
    @Override
    public String getMessage() {
        return "Совпадений не найдено";
    }
}
