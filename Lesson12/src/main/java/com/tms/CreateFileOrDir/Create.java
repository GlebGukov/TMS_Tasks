package com.tms.CreateFileOrDir;
import com.tms.MyExseptions.ExpNull;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Create {
    String name;
    final String i = " -- не соответствие названия или номера";
//    final String path = "C:\\Users\\User\\Desktop\\ideaFiles\\";
    Path path = Paths.get("C:\\Users\\User\\Desktop\\ideaFiles\\");

    public void file(String name) {
        this.name = name;

        Path own = Paths.get("C:\\Users\\User\\Desktop\\ideaFiles\\" + name + ".txt");
        try {
            if (!Files.exists(own)) {
                Path file = Files.createFile(own);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void entry(String doc) {
        if (doc.isBlank() || doc.isEmpty()) {
            try {
                throw new ExpNull();
            } catch (ExpNull ex) {
                ex.getMessage();
            }
        }
        if (doc.length() == 15 && doc.contains("Contract") || doc.contains("Docnum")) {
            try (FileOutputStream zapis = new FileOutputStream(path + "Valid.txt", true)) {
                PrintStream zap = new PrintStream(zapis);
                zap.println(doc);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (FileOutputStream zapis = new FileOutputStream(path + "NoValid.txt", true)) {
                PrintStream zap = new PrintStream(zapis);
                zap.print(doc + i);
//                zap.println(i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void input(String AorB) {
        String a = "Valid.txt";
        String b = "NoValid.txt";
        Path path1 = Paths.get(path+a);
        Path path2 = Paths.get(path+b);
        String rd = "";
        if (AorB.equalsIgnoreCase("a")) {
            try {
                String ra = Files.readString(path1);
                System.out.println(ra);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else if (AorB.equalsIgnoreCase("b"))  {
            try {
                String ra = Files.readString(path2);
                System.out.println(ra);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else{
            System.out.println("введите путь а (к валидному документу) или б(к не валидному)");
        }
    }

}
