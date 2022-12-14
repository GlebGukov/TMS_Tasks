package com.tms;



import com.tms.Servises.*;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path own = Paths.get("C:\\Users\\User\\Desktop\\IdeaFiles\\");  // путь

        Doc one = new Doc("Contract","1551234");            //доки
        Doc two = new Doc("Docnum","515166325");
        Doc three = new Doc ("Article","151231");
        Doc four = new Doc("Contract","141551233455");

        CreateFile valid = new CreateFile("Valid");          //создание экземпляра файла с названием
        CreateFile noValid = new CreateFile("NoValid");
//
//        valid.push(own);              //создание файла по (указанному пути)
//        noValid.push(own);

//        one.pushText(own);            // залив информации дока в документ по пути : валидный - valid, остальные - noValid
//        two.pushText(own);
//        three.pushText(own);
//        four.pushText(own);

//        valid.content(own);           // информация по файлам
//        noValid.content(own);

            Validation v = new Validation(own);

        v.val(valid,noValid);                   // Вывод всей инфы из двух доков в отсортировоном листе











    }
}