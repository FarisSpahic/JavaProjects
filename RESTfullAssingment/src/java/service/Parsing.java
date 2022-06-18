
package service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class Parsing {
    
   
    public String getTranslation(String word, String originL, String transL) throws MalformedURLException, ParserConfigurationException, IOException, XMLStreamException {
        XMLInputFactory xmlif = XMLInputFactory.newFactory();
        File f = new File("words.xml");
        String path = f.getAbsolutePath().replaceAll("\\\\", "\\\\\\\\");
        Reader reader = new FileReader(path);
        XMLEventReader xmlsr = xmlif.createXMLEventReader(reader);

        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> elementList = new ArrayList<>();
        String startTag;
        boolean insideW = false;

        while (xmlsr.hasNext()) {
            XMLEvent event = xmlsr.nextEvent();
            switch (event.getEventType()) {

                case XMLStreamReader.START_ELEMENT:
 
                    StartElement se = event.asStartElement();
                    startTag = se.getName().toString();

                    if (startTag != "root" && startTag != "word") {
                        insideW = true;
                        elementList.add(startTag);
                       
                    } else {
                        insideW = false;
                    }

                    break;

                case XMLStreamReader.CHARACTERS:

                    Characters cs = event.asCharacters();
                    String content = cs.getData();
                    if (insideW) {
                       
                        map.put(elementList.get(elementList.size() - 1), content);
                       
                        insideW = false;
                    }
                    break;
                case XMLStreamReader.END_ELEMENT:
                    EndElement eTag = event.asEndElement();
                    String endTag = eTag.getName().toString();
                    if (endTag == "word") {
                        if (map.containsValue(word)) {
                            if (map.containsKey(transL)) {
                                return map.get(transL);
                            }

                        }
                        map.clear();
                        elementList.clear();
                    }
                    break;
            }

        }
        return "There is no translation...";
    }
         
}
