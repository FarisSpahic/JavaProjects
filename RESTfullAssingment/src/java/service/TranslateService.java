
package service;

import java.io.IOException;
import java.net.MalformedURLException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

@Path("/MyRestService/{a}/{b}/{c}")
public class TranslateService {
    
    @GET
    public String doGet(@PathParam("a") String word, @PathParam("b") String originL,@PathParam("c") String transL) throws ParserConfigurationException, IOException, MalformedURLException, XMLStreamException{
        Parsing p = new Parsing();
        String respond = p.getTranslation(word, originL, transL);
        return respond;
    }
}
