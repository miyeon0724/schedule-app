package edu.hs.schedule.dao;

import edu.hs.schedule.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static final List<User> users = new ArrayList<>();

    public static void add(User user) {
        users.add(user);
    }

    public static List<User> getAll() {
        return users;
    }

    public static User getByName(String name) {
        for (User u : users) {
            if (u.getName().equals(name)) return u;
        }
        return null;
    }

    public static void clearAll() {
        users.clear();
    }
}
