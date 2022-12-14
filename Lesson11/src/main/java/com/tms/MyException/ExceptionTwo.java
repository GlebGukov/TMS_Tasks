package com.tms.MyException;

public class ExceptionTwo extends StringIndexOutOfBoundsException {
    @Override
    public String getMessage() {
        return "Документ не соответствует стандартам документа ";
    }


}
