import java.io.FileInputStream;
import java.io.InputStream;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.events.Event;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Santhosh
 */
public class XMLParsing {

    static XMLInputFactory inputFactory = null;
    static InputStream in = null;
    static XMLEventReader eventReader = null;

    public static void XMLFile(String xmlFile) throws Exception {
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        InputStream in = new FileInputStream(xmlFile);
        XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
        XMLParse();
    }

    public static void XMLParse() throws Exception {
        while(eventReader.hasNext()){
            XMLEvent event = eventReader.nextEvent();
            if(event.isStartElement()){
                System.out.println("<"+event.asStartElement().getName().getLocalPart()+">");
            }
            else if(event.isEndElement()){
                System.out.println("</"+event.asEndElement().getName().getLocalPart()+">");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        XMLFile("Slides.xml");
        // XMLParse();
    }

}
