package managers;

import entities.User;

public class UserManager {
    public void addUser(User user) {
        System.out.println("User added: " + user);

    }

    public void removeUser(User user) {
        System.out.println("User removed:" + user);
    }

    public void listUser(User user) {
        System.out.println("User:" + user);
    }

}
