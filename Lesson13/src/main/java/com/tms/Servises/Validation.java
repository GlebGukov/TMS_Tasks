package com.tms.Servises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class Validation {
    private Path pathValidations;
    private Set<String> theEnd;

    public Set<String> getTheEnd() {
        return theEnd;
    }

    public void setTheEnd(Set<String> theEnd) {
        this.theEnd = theEnd;
    }

    public Path getPathValidations() {
        return pathValidations;
    }

    public void setPathValidations(Path pathValidations) {
        this.pathValidations = pathValidations;
    }
    public Validation(Path path) {
        setPathValidations(path);
    }
    public void val (CreateFile first,CreateFile second) {

        Set<String> all = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(getPathValidations().toFile()+first.getName()))) {
            String s = br.readLine();
            while (s!=null){
                all.add(s+"\n");
                s = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader rd = new BufferedReader(new FileReader(getPathValidations().toFile()+second.getName()))) {
            String s = rd.readLine();
            while (s!=null){
                all.add(s+"\n");
                s = rd.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        setTheEnd(all);
        System.out.println(getTheEnd());
    }
    }
