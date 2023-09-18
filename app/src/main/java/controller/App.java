package controller;

import model.Client;

/**
 * Responsible for staring the application.
 */
public class App {
  /**
   * Application starting point.

   * @param args command line arguments.
   */
  public static void main(String[] args) {
    // adapt to start the application in your way
    // model.Client m = new model.Client("beata", "be222gr@student.lnu.se");
    // Simple c = new Simple();
    view.ConsoleUI v = new view.ConsoleUI();

    model.Nutritionist nutritionist = new model.Nutritionist();

    // Add a new client
    Client newClient = nutritionist.addClient("Miranda", "miranda@thebest.se");
    if (newClient != null) {
      v.showMessage("Client added");
    } else {
      v.showMessage("Client not added");
    }

    // c.doSomethingSimple(m, v);
  }
}
