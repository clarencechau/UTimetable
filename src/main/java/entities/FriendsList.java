package entities;

import java.util.ArrayList;

public class FriendsList extends Student{
    ArrayList<Student> friends;
    ArrayList<Student> blocked;

    public ArrayList<Student> getFriends(Student studentValue) {
        return studentValue.friends;
    }

    public ArrayList<Student> getBlocked(Student studentValue) {
        return studentValue.blocked;
    }

    public void setFriends(Student studentValue, ArrayList<Student> friends) {
        studentValue.friends = friends;
    }

    public void setBlocked(Student studentValue, ArrayList<Student> blocked) {
        studentValue.blocked = blocked;
    }

}