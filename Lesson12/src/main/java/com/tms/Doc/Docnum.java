package com.tms.Doc;
import com.tms.MyExseptions.*;

public class Docnum extends CreateNewDoc {
    final String name = "Docnum";

    public Docnum(String number) {
        setNumber(number);
        boolean num = getNumber().length() == 9;
        try {
            if (!num) {
                throw new ExpIndex();
            }
            if (number.isEmpty() || number.isBlank()) {
                throw new ExpNull();
            }
        }
        catch (ExpNull one) {
            System.out.println(one.getMessage());
        }
        catch (ExpIndex one){
            System.out.println(one.getMessage()+" (номер документа должен содержать 9 символов)");

        }
    }
    @Override
    public String info() {
        boolean num = getNumber().length() ==9;
        if (num) {
            return this.name + getNumber();
        } else {
            return "Не верный формат документа";
        }
    }
}
