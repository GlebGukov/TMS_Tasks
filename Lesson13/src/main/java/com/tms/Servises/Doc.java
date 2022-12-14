package com.tms.Servises;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;

public class Doc {
    private String docName;
    private String docNum;
    public String getDocName() {return docName;}
    public void setDocName(String docName) {this.docName = docName;}
    public String getDocNum() {return this.docNum;}
    public void setDocNum(String docNum) {this.docNum = docNum;}
    public Doc(String docName, String docNum) {
        setDocName(docName);
        setDocNum(docNum);
    }
    public void pushText(Path path) {
        String a = getDocName() + getDocNum();
        boolean name = getDocName().contains("Docnum") || getDocName().contains("Contract");
        boolean num = a.length() == 15;
        if (name && num) {
            try (FileOutputStream push = new FileOutputStream(path+"\\Valid.txt", true)) {
                PrintStream ps = new PrintStream(push);
                ps.println(a);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            try (FileOutputStream fo = new FileOutputStream( path+ "\\NoValid.txt", true)) {
                PrintStream ps = new PrintStream(fo);
                if (!name) {
                    ps.println(a + " - Невалидое значение имени");
                }
                else {
                    ps.println(a + " - Невалидое значение номера");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
