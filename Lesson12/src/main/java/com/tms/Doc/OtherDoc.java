package com.tms.Doc;
import com.tms.MyExseptions.*;

public class OtherDoc extends CreateNewDoc {

    public OtherDoc(String name, String number) {
        setName(name);
        setNumber(number);
        int a = name.length() + number.length();
        boolean num = a >=10 && a <=20;
        try {
            if (!num) {
                throw new ExpIndex();
            }
            if (name.isEmpty() || name.isBlank() && number.isEmpty() || number.isBlank()) {
                throw new ExpNull();
            }
        } catch (ExpNull one) {
            System.out.println(one.getMessage());
        } catch (ExpIndex one) {
            System.out.println(one.getMessage());

        }
    }
    public String info(){
        int a = getName().length()+getNumber().length();
        boolean num = a >=10 && a <=20;
        if (num) {
            return getName() + getNumber();
        } else {
            return "(Количество символов (имя + номер) документа не должно превышать 15 символов)";
        }
    }
}
