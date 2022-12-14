package com.tms.Doc;

import com.tms.MyExseptions.*;

public class CreateNewDoc {
    private String name;
    private String number;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CreateNewDoc() {
    }

    public CreateNewDoc(String name, String number) {
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
        return getName()+getNumber();
    }
}
