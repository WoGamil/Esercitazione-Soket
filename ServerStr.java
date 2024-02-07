import java.io.*;
import java.net.*;
import java.util.*;

public class ServerStr {
    ServerSocket server null;
    Socket client null;
    String stringaRicevuta null;
    String stringaModificata null;
    BufferedReader inDalClient;
    DataautputStream outVersoClient;

    public Socket attendi() {
        try {
            System.out.println("1 SERVER partito in esecuzione...");
            // crno un server sulis porta 6709.
            server new ServerSocket (6789):
            // rimane in attesa di un client
            client server.accept();
            // chiudo il server per inibice altri client
            server.close();
            //azzocio due oggetti al rocket del client per effettuare la scrittura e la lettura inbalclient new BufferedReader(new InputStreamReader (client.getInputStream()));
            outVersoClient new DatabutputStream(client.getOutputStream());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Errore durante l'istanza del server!");
            System.exit(1);
            return client;
        }
    }

    public void comunica() {
        try {
            // rimango in attesa della riga trasnmessa dal client
            System.out.println("3 benvenuto client, scrivi una frase e la trasformo in maiuscolo. Attendo...");
            stringaRicevuta inDalClient.readLine();
            System.out.println("6 ricevuta la stringa dal cliente: "+stringaRicevuta);
            //la modifico e la rispedisco al client
            stringaModificata-stringaRicevuta. toUpperCase();
            System.out.println("7 invio la stringa modificata al client ...");
            outVersoClient.writeBytes(stringallodificata+'\n');
            //termina elaborazione sul server chiudo la connessione del client System.out.println("9 SERVER: fine elaborazione ... buona notte!");
            client.close();
        }
    }
}

public static void main(String args[]) {
    ServerStr servente = new ServerStr();
    servente.attendi ();
    servente.comunica();
}