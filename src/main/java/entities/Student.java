package entities;
import entities.User;

import java.util.ArrayList;

public class Student extends User {
    protected ArrayList<Student> friends;
    protected ArrayList<Student> blocked;
    protected Timetable timetable;
    String username;
    String password;

    @Override
    public String getUsername() { return this.username; }

    @Override
    public String getPassword() { return this.password; }

    public Timetable getTimetable() {
        return timetable;
    }

    @Override
    public void setUsername(String username) { this.username = username; }
    @Override
    public void setPassword(String password) { this.password = password; }

    public void setTimetable(Timetable timetable) {
        // TODO
        // A setter function that sets an empty timetable
        this.timetable = timetable;
    }

    public ArrayList<Student> getFriends() {
        return friends;
    }

    public ArrayList<Student> getBlocked() {
        return blocked;
    }

    public void setFriends(ArrayList<Student> friends) {
        this.friends = friends;
    }

    public void setBlocked(ArrayList<Student> blocked) {
        this.blocked = blocked;
    }
}