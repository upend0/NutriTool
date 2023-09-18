package model;

/**
 * Client class
 */
public class Client {
  private String name;
  private String email;

  public Client (String name, String email) {
    setName(name);
    setEmail(email);
  }

  private void setName (String name) {
    this.name = name;
  }

    private void setEmail (String email) {
    this.email = email;
  }

  public String getName () {
    return this.name;
  }

  public String getEmail () {
    return this.email;
  }
  /**
   * Returns a very important message.

   * @return the message.
   */
  public String getMessage() {
    return "Hello Simple Client";
  }


}
