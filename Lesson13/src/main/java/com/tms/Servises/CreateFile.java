package com.tms.Servises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class CreateFile {
    private String name;
    private Path pathToFile;
    public Path getPathToFile() {return pathToFile;}
    public void setPathToFile(Path path) {
        this.pathToFile = path;}
    public String getName() {return name;}
    public void setName(String name) {
        this.name = "\\" + name + ".txt";
    }
    public CreateFile(String name) {
        setName(name);
    }
    public void push(Path path) {
        setPathToFile(Paths.get(path + getName()));
        if (!Files.exists(getPathToFile())) {
            try {
                Files.createFile(getPathToFile());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void content(Path path) {
        setPathToFile(Paths.get(path + getName()));
        try (BufferedReader con = new BufferedReader(new FileReader(getPathToFile().toFile()))) {
            String all = con.readLine();
            while (all!=null){
                System.out.println(all);
                all = con.readLine();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}