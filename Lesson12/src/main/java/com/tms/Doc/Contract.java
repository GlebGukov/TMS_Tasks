package com.tms.Doc;
import com.tms.MyExseptions.*;

public class Contract extends CreateNewDoc {


    //    public static String info= String ;
    final String name = "Contract";

    public Contract(String number) {
        setNumber(number);
        boolean num = getNumber().length() == 7;
        try {
            if (!num) {
                throw new ExpIndex();
            }
            if (number.isEmpty() || number.isBlank()) {
                throw new ExpNull();
            }
        } catch (ExpNull one) {
            System.out.println(one.getMessage());
        } catch (ExpIndex one) {
            System.out.println(one.getMessage() + " (номер документа должен содержать 7 символов)");

        }

    }
    @Override
    public String info() {
        boolean num = getNumber().length() ==7;
        if (num) {
            return this.name+getNumber();
        } else {
            return "Не верный формат документа";

        }
    }
}