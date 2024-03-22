package de.lubowiecki.playground.jdbc;

import java.sql.SQLException;

public class RepoTest {

    private static final Repository<User> repo = new UserRepository();

    public static void main(String[] args) {

        User user = new User();
        user.setFirstname("Tony");
        user.setLastname("Stark");
        user.setEmail("t.stark@shield.org");

        try {
            repo.insert(user);
            System.out.println("Gespeichert");
        }
        catch (SQLException e) {
            System.out.println("Problem beim Einfügen");
        }

    }

}
