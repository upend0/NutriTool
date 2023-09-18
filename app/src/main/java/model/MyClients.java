package model;

import java.util.ArrayList;

/**
 * Collects all clients
 */
public class MyClients {
    public ArrayList <Client> allClients;

    public MyClients () {
        this.allClients  = new ArrayList<Client>();
    }

    public void addClient (String name, String email) {
        // if sats om mail redan finns
        Client c = new Client(name, email);
        allClients.add(c);
    }

    public ArrayList <Client> getClients () {
        return allClients;
    }
}
