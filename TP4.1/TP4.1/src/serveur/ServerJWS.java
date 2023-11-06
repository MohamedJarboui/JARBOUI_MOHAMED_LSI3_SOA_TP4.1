package serveur;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServerJWS {
    public static void main(String[] args) {
        CalculatriceWS calculatrice =new CalculatriceWS();
        String url ="http://localhost:8084/";
        Endpoint.publish(url,new calculatriceWS());
        System.out.println("Server url:"+ url);

    }
}