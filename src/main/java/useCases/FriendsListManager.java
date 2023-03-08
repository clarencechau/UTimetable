package useCases;

import entities.Student;

import java.util.ArrayList;

public class FriendsListManager {
    public void addFriends(Student student1, Student student2) {
        if (student1.getFriends().contains(student2)) {
            ;
        } else {
            ArrayList<Student> friends = student1.getFriends();
            friends.add(student2);
            student1.setFriends(friends);
        }
    }

    public void removeFriends(Student student1, Student student2) {
        if (student1.getFriends().contains(student2)) {
            ArrayList<Student> friends = student1.getFriends();
            friends.remove(student2);
            student1.setFriends(friends);
        } else {
            ;
        }
    }

    public void blockFriends(Student student1, Student student2) {
        if (student1.getFriends().contains(student2)) {
            removeFriends(student1, student2);
        }

        if (student1.getBlocked().contains(student2)) {
            ;
        } else {
            ArrayList<Student> blocked = student1.getBlocked();
            blocked.add(student2);
            student1.setBlocked(blocked);
        }
    }

    public void unblockFriends(Student student1, Student student2) {
        if (student1.getBlocked().contains(student2)) {
            ArrayList<Student> blocked = student1.getBlocked();
            blocked.remove(student2);
            student1.setBlocked(blocked);
        } else {
            ;
        }
    }

    public void starFriends(Student student1, Student student2) {
        if (student1.getFriends().contains(student2)) {
            ArrayList<Student> starred = student1.getFriends();
            starred.add(0, student2);
            student1.setFriends(starred);
        } else {
            ;
        }
    }

    public void unstarFriends(Student student1, Student student2) {
        if (student1.getFriends().contains(student2)) {
            ArrayList<Student> starred = student1.getFriends();
            starred.remove(student2);
            starred.add(student2);
            student1.setFriends(starred);
        } else {
            ;
        }
    }

    public static Student getFriend(Student student1, String username) {
        ArrayList<Student> friends = student1.getFriends();
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getUsername() == username) {
                return friends.get(i);
            }
        }
        return student1;
    }
}
