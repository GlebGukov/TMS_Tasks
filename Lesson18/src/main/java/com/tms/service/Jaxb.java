package com.tms.service;

import model.Animal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Jaxb {

    public void marshal(Animal Zoo, String nameDoc) throws JAXBException {
        File file = new File("src\\resources\\" + nameDoc + ".xml");
        JAXBContext context = JAXBContext.newInstance(Animal.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(Zoo, file);
    }
}
