package model;

import java.util.ArrayList;

/**
 * Collects all clients
 */
public class Nutritionist {
    public ArrayList <Client> allClients;

    public Nutritionist () {
        this.allClients  = new ArrayList<Client>();
    }

    public Client addClient (String name, String email) {
        // Check so that the email is not already in use
        if (!isUniqueEmail(email)) {
            // view.ConsoleUI.showMessage("Email already in use");
            return null;
        }
        Client c = new Client(name, email);
        allClients.add(c);
        return c;
    }

    public ArrayList <Client> getClients () {
        return allClients;
    }

    private boolean isUniqueEmail (String email) {
        for (Client c : allClients) {
            if (c.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }
}
