package com.igt.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public class Processor {
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;

    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }

    //Converts Object to XML file
    public void objectToXML(String fileName, Object graph) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            marshaller.marshal(graph, new StreamResult(fos));
        }
    }

    //Converts XML to Java Object
    public Object xmlToObject(String fileName) throws IOException {
        try (InputStream fis = getClass().getResourceAsStream(fileName)) {
            return unmarshaller.unmarshal(new StreamSource(fis));
        }
    }
}