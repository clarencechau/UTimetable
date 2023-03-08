package entities;
import entities.User;

public class Admin extends User {
    String username;
    String password;

    @Override
    public String getUsername() { return this.username; }
    @Override
    public String getPassword() { return this.password; }

    @Override
    public void setUsername(String username) { this.username = username; }
    @Override
    public void setPassword(String password) { this.password = password; }
}
