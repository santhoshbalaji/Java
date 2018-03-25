import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.*;
import javax.xml.stream.events.*;

class SlideParser {
    public SlideParser() throws Exception {

    }

    public List<Slides> parseXML(String xmlFile) throws Exception {
        List<Slides> Slide = new LinkedList<Slides>();
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        InputStream in = new FileInputStream(xmlFile);
        XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
        Slides slides = null;
        Slide slide = null;
        String pptName = "";
        while (eventReader.hasNext()) {
            XMLEvent event = eventReader.nextEvent();
            if (event.isStartElement()) {
                String ele = event.asStartElement().getName().getLocalPart();
                switch (ele) {
                case "Slides":
                    slide = new Slide();
                    StartElement startElement = event.asStartElement();
                    Iterator<Attribute> attributes = startElement.getAttributes();
                    while (attributes.hasNext()) {
                        Attribute attribute = attributes.next();
                        if (attribute.getName().getLocalPart().equals("pptname")) {
                            pptName = attribute.getValue().toUpperCase();
                        }
                    }
                    break;
                case "Slide":
                    slides = new Slides();
                    startElement = event.asStartElement();
                    attributes = startElement.getAttributes();
                    while (attributes.hasNext()) {
                        Attribute attribute = attributes.next();
                        if (attribute.getName().toString().equals("className")) {
                            slides.setclassName(attribute.getValue().toUpperCase());
                            slides.setpptName(pptName);
                        }
                    }
                    break;
                case "Heading":
                    event = eventReader.nextEvent();
                    slides.setHeading(event.asCharacters().getData());
                    break;
                case "Bullet":
                    event = eventReader.nextEvent();
                    slides.setBullet(event.asCharacters().getData());
                    break;
                default:
                    break;
                }
            }
            if (event.isEndElement()) {
                EndElement endElement = event.asEndElement();
                if (endElement.getName().getLocalPart().equals("Slide")) {
                    Slide.add(slides);
                }
            }
        }
        return Slide;
    }

}