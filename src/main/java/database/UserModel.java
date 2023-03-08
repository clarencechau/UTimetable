package database;

import entities.Student;
import entities.Timetable;
import entities.User;

import java.util.ArrayList;

public class UserModel {

    public String username;

    public String password;

    public String email;

    public ArrayList<Student> friends;
    public ArrayList<Student> blocked;

    public Timetable timetable;

    public UserModel(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Student> getFriendsList() {
        return friends;
    }

    public ArrayList<Student> getBlockedList() {
        return blocked;
    }
    public Timetable getTimetable() {
        return timetable;
    }

}