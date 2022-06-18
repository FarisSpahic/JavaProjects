/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientPackage;

import java.util.Scanner;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Faris
 */
public class ClientClass {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        String language, originalL, translationL;
        System.out.println("Unesite rijec koju zelite prevesi: ");
        Scanner scanner = new Scanner(System.in);

        language = scanner.nextLine();
        
        
        System.out.println("Unesite jezik rijeci koju zelite prevesti: ");
        originalL = scanner.nextLine();
        
        
        System.out.println("Unesite jezik na koji zelite prevesti: ");
        translationL = scanner.nextLine();
        
        
        WebTarget target = client.target("http://localhost:8080/RESTfullAssingment/resource/MyRestService/" + language + "/" + originalL + "/" + translationL);
        System.out.println("Prijevod: "+target.request(MediaType.TEXT_XML).get(String.class));

    }
}
