package com.tms.service;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class MyHandler {

    public void start(String tag, String parseDoc, String nameDoc) throws ParserConfigurationException, SAXException, IOException {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                String name = attributes.getValue(tag);
                if (name != null && !name.isEmpty()) {
                    File file = new File("src\\resources\\" + nameDoc + ".txt");
                    try (PrintWriter a = new PrintWriter(file)) {
                        a.println("В документе"+parseDoc+"присуствует"+tag+name);
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {
                    System.out.println("Указанного "+tag+" в документе"+parseDoc +"не имеется");
                }
            }
        };
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("src\\resources\\" + parseDoc + ".xml"), handler);
    }
}