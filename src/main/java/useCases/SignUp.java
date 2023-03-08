package useCases;

import entities.User;
import entities.Student;
import entities.Admin;

public class SignUp {
    String username;
    String password;
    String message;
    public boolean checkNewUsername() {
        // check if the given username is already taken by another user.
        //
    }

    public boolean checkPasswordStrength() {
        // password should be at least 8 characters long, contain 1 uppercase letter, 4 lowercase letters and numbers,
        // without any empty spaces. (max 20 chars long)

        // check the length of the password
        if (this.password.length() < 8) {
            this.message = this.message + "PASSWORD SHOULD BE AT LEAST 8 CHARACTERS LONG \n";
        } else if (this.password.length() > 20) {
            this.message = this.message + "PASSWORD SHOULD NOT EXCEED 20 CHARACTERS \n";
        }

        int upper = 0;
        int lower = 0;
        int nums = 0;
        int blanks = 0;
        // check the number of lowercase, uppercase letters, nums, and blanks.
        for (int k = 0; k < this.password.length(); k++) {
            if (Character.isUpperCase(this.password.charAt(k))) {
                upper++;
            } else if (Character.isLowerCase(this.password.charAt(k))) {
                lower++;
            } else if (Character.isDigit(this.password.charAt(k))) {
                nums++;
            } else if (Character.isSpaceChar(this.password.charAt(k))) {
                blanks++;
            }
        }

        if (lower < 4) {
            this.message = this.message + "PASSWORD SHOULD CONTAIN AT LEAST 4 LOWERCASE LETTERS \n";
        } else if (upper < 1) {
            this.message = this.message + "PASSWORD SHOULD CONTAIN AT LEAST 1 UPPERCASE LETTER \n";
        } else if (nums < 4) {
            this.message = this.message + "PASSWORD SHOULD CONTAIN AT LEAST 4 NUMBERS \n";
        } else if (blanks > 0) {
            this.message = this.message + "PASSWORD CANNOT CONTAIN ANY BLANK SPACES \n";
        }

        // check if there are any miscellaneous characters other than alphabets or nums (ex. special characters)

        // if there are no error messages to show, return true. Otherwise, false.
        if (message.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getErrorMessage() {
        if (this.checkPasswordStrength()) {
            this.message = "";
        }
        return this.message;
    }
}
