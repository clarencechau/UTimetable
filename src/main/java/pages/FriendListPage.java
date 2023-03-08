package pages;

import entities.Student;
import useCases.FriendsListManager;

import java.util.Map;
import java.util.Scanner;

public class FriendListPage extends Page{

    private static Student currentUser;

    private FriendsListManager friendsListManager;

    public FriendListPage(Router router) {
        super(router);
        this.friendsListManager = new FriendsListManager();
    }

    @Override
    public Page run() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Select student");

        String studentName = myObj.nextLine();

        Student friend = FriendsListManager.getFriend(currentUser, studentName);

        if (friend != currentUser) {
            ;
        } else {
            Student student2 = new Student();
            student2.setUsername(studentName);
            friend = student2;
        }
        enum Option {
            ADD_FRIEND,
            REMOVE_FRIEND,
            BLOCK_FRIEND,
            UNBLOCK_FRIEND,
            STAR_FRIEND,
            UNSTAR_FRIEND,
            SIGN_OUT,
            VIEW_TIMETABLE
        }
        Map<String, Option> options = Map.of(
                "Add Friend", Option.ADD_FRIEND,
                "Remove Friend", Option.REMOVE_FRIEND,
                "Star Friend", Option.STAR_FRIEND,
                "Unstar Friend", Option.UNSTAR_FRIEND,
                "Block Friend", Option.BLOCK_FRIEND,
                "Unblock Friend", Option.UNBLOCK_FRIEND,
                "Sign Out", Option.SIGN_OUT,
                "View Timetable", Option.VIEW_TIMETABLE

        );
        Option selection = promptInput(options);

        switch (selection) {
            case VIEW_TIMETABLE:
                return this.router.getTimetableViewerPage();
            case UNBLOCK_FRIEND:
                this.friendsListManager.unblockFriends(currentUser, friend);
                return this.router.getFriendListPage();
            case BLOCK_FRIEND:
                this.friendsListManager.blockFriends(currentUser, friend);
                return this.router.getFriendListPage();
            case UNSTAR_FRIEND:
                this.friendsListManager.unstarFriends(currentUser, friend);
                return this.router.getFriendListPage();
            case STAR_FRIEND:
                this.friendsListManager.starFriends(currentUser, friend);
                return this.router.getFriendListPage();
            case ADD_FRIEND:
                this.friendsListManager.addFriends(currentUser, friend);
                return this.router.getFriendListPage();
            case REMOVE_FRIEND:
                this.friendsListManager.removeFriends(currentUser, friend);
                return this.router.getFriendListPage();
            case SIGN_OUT:
                return this.router.getLogin();
        }
        return this.router.getFriendListPage();
    }
}