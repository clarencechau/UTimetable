package useCases;

import entities.User;
import entities.Student;
import entities.Admin;

public class SignIn {
    int repeated;
    public boolean checkUsername(User user1, String username) {
        return user1.getUsername() == username;
    }

    public boolean checkPassword(User user2, String password) {
        if (user2.getPassword() == password) {
            return true;
        } else {
            this.repeated += 1;
            return false;
        }
    }

    public int repeatedPassword() {
        return this.repeated;
    }
}
