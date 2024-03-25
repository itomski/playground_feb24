package de.lubowiecki.playground.jdbc;

import java.sql.SQLException;

public class RepoTest {

    private static final Repository<User> repo = new UserRepository();

    public static void main(String[] args) {

        /*
        User user = new User();
        user.setFirstname("Max");
        user.setLastname("Banner");
        user.setEmail("m.banner@shield.org");
        */

        try {
            /*
            System.out.println(user.getId());
            repo.insert(user);
            System.out.println("Gespeichert");

            user.setLastname("Mustermann");
            user.setEmail("m.mustermann@shield.org");
            repo.update(user);
            */

            // Find All
            for(User u : repo.find()) {
                System.out.println(u.getFirstname() + " " + u.getLastname());
            }

            /*
            User u = repo.find(20);
            System.out.println(u.getFirstname() + " " + u.getLastname());
            */
        }
        catch (SQLException e) {
            System.out.println("Problem beim Einfügen");
            e.printStackTrace();
        }

    }

}
