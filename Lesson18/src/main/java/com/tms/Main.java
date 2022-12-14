package com.tms;


import com.tms.model.*;
import com.tms.service.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException, ParserConfigurationException, SAXException {
//        Основное задание
//        1. Написать программу для парсинга xml документа.
//        Программа на вход получает строку к папке, где находится документ.
//        Распарсить нужно только один документа - соответственно,
//                предусмотреть различные проверки, например на то, что в папке нет
//        файлов, или в папке несколько документов формата xml и другие
//        возможные проверки.
//        Необходимо распарсить xml документ и содержимое тегов line записать в
//        другой документ.
//        Название файла для записи должно состоять из значений тегов и имеет
//        вид: <firstName>_<lastName>_<title>.txt
//        Дополнительное задание
//        2. Создать схему для документа XML.
//        3. Реализовать работу с XML документов используя JAXB.;
        Animal wolf1 = new Wolf("Anni", 5, 122);
        Animal rabbit1 = new Rabbit("Rodjer", 2, 331);
        Jaxb jaxb = new Jaxb();
        jaxb.marshal(wolf1, "Wolf");
        jaxb.marshal(rabbit1,"Rabbit");
        MyHandler myHandler = new MyHandler();
        myHandler.start("id","Wolf","wolf");
    }
}