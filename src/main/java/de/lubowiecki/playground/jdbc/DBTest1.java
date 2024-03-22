package de.lubowiecki.playground.jdbc;

import java.sql.*;

public class DBTest1 {

    private static final String URL = "jdbc:sqlite:sample.db";

    public static void main(String[] args) {

        // CRUD
        // create
        // read
        // update
        // delete

        /*
        // INSERT
        if(insert("Bruce", "Banner", "b.banner@shield.org")) {
            System.out.println("Datensatz wurde gespeichert.");
        }
        */

        /*
        // UPDATE
        if(update("Carol", "Danvers", "c.danvers@shield.org", 1)) {
            System.out.println("Datensatz wurde geändert.");
        }
        */

        /*
        // DELETE
        if(delete(3)) {
            System.out.println("Datensatz wurde gelöscht.");
        }
        */

        printAll();

    }

    private static boolean delete(int id) {

        try (Connection dbh = DriverManager.getConnection(URL);
             Statement stmt = dbh.createStatement()) {

            final String SQL = "DELETE FROM users WHERE id = %d";
            return stmt.executeUpdate(String.format(SQL, id)) == 1;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    private static boolean update(String firstname, String lastname, String email, int id) {

        try (Connection dbh = DriverManager.getConnection(URL);
             Statement stmt = dbh.createStatement()) {

            final String SQL = "UPDATE users SET firstname = '%s', lastname = '%s', email = '%s' WHERE id = %d";
            return stmt.executeUpdate(String.format(SQL, firstname, lastname, email, id)) == 1;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }


    private static boolean insert(String firstname, String lastname, String email) {

        try (Connection dbh = DriverManager.getConnection(URL);
             Statement stmt = dbh.createStatement()) {

            final String SQL = "INSERT INTO users (id, firstname, lastname, email) VALUES(null, '%s', '%s', '%s')";
            return stmt.executeUpdate(String.format(SQL, firstname, lastname, email)) > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    private static  void printAll() {

        try(Connection dbh = DriverManager.getConnection(URL);
            Statement stmt = dbh.createStatement()) {

            final String SQL = "SELECT * FROM users";

            ResultSet results = stmt.executeQuery(SQL);

            while(results.next()) {
                System.out.print(results.getInt("id") + ", ");
                System.out.print(results.getString("firstname") + " ");
                System.out.print(results.getString("lastname") + ", ");
                System.out.print(results.getString("email"));
                System.out.println();
            }

            // stmt.close(); // wird automatisch ausgeführt
            // dbh.close(); // wird automatisch ausgeführt
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
