package com.tms;

import com.tms.CreateFileOrDir.Create;
import com.tms.Doc.*;

public class Main {
    public static void main(String[] args) {
        CreateNewDoc firstContract = new Contract("1234567");
        CreateNewDoc firstDocnum = new Docnum("123456789");
        CreateNewDoc firstOther = new CreateNewDoc("Article","12371678");
        Create create = new Create();
        create.file("Valid");
        create.file("NoValid");
        create.entry(firstDocnum.info());
        create.entry(firstContract.info());
        create.entry(firstOther.info());
        create.input("b");

    }
}