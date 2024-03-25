package de.lubowiecki.playground.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Repository<User> {

    private final String TABLE = "users";

    public UserRepository() {
        try {
            createTable();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean insert(User user) throws SQLException {

        final String SQL = "INSERT INTO " + TABLE + " (id, firstname, lastname, email) VALUES(null, ?, ?, ?)";

        try(Connection dbh = DbUtils.getConnection();
            PreparedStatement stmt = dbh.prepareStatement(SQL)) {

            stmt.setString(1, user.getFirstname());
            stmt.setString(2, user.getLastname());
            stmt.setString(3, user.getEmail());
            stmt.execute();

            // Die letzte ID abfragen
            if(stmt.getUpdateCount() > 0) {
                ResultSet keys = dbh.createStatement().executeQuery("SELECT last_insert_rowid()");
                if(keys.next()) {
                    user.setId(keys.getInt("last_insert_rowid()"));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean update(User user) throws SQLException {

        final String SQL = "UPDATE " + TABLE + " SET firstname = ?, lastname = ?, email = ? WHERE id = ?";

        try(Connection dbh = DbUtils.getConnection();
            PreparedStatement stmt = dbh.prepareStatement(SQL)) {

            stmt.setString(1, user.getFirstname());
            stmt.setString(2, user.getLastname());
            stmt.setString(3, user.getEmail());
            stmt.setInt(4, user.getId());
            stmt.execute();

            return stmt.getUpdateCount() > 0;
        }

    }

    @Override
    public boolean delete(User user) throws SQLException {
        return delete(user.getId());
    }

    public boolean delete(int id) throws SQLException {
        final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;

        try(Connection dbh = DbUtils.getConnection();
            Statement stmt = dbh.createStatement()) {
            return stmt.executeUpdate(SQL) == 1;
        }
    }

    @Override
    public List<User> find() throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE;

        try(Connection dbh = DbUtils.getConnection();
            Statement stmt = dbh.createStatement()) {

            ResultSet results = stmt.executeQuery(SQL);

            List<User> users = new ArrayList<>();

            while(results.next()) {
                users.add(create(results));
            }

            return users;
        }
    }

    @Override
    public User find(int id) throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;
        // Kein PreparedStatement nötig. Id ist eine Zahl

        try(Connection dbh = DbUtils.getConnection();
            Statement stmt = dbh.createStatement()) {

            ResultSet results = stmt.executeQuery(SQL);

            if(results.next()) {
                return create(results);
            }

            return null; // TODO: Ein Optional wäre besser!
        }
    }

    @Override
    public User create(ResultSet result) throws SQLException {

        User user = new User();
        user.setId(result.getInt("id"));
        user.setFirstname(result.getString("firstname"));
        user.setLastname(result.getString("lastname"));
        user.setEmail(result.getString("email"));

        return user;
    }

    @Override
    public void createTable() throws SQLException {

        final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " ("
                            + "id INTEGER, "
                            + "firstname TEXT NOT NULL,"
                            + "lastname TEXT NOT NULL,"
                            + "email TEXT NOT NULL,"
                            + "PRIMARY KEY(id AUTOINCREMENT)"
                            + ")";

        try(Connection dbh = DbUtils.getConnection();
            Statement stmt = dbh.createStatement()) {
            stmt.execute(SQL);
        }
    }
}
