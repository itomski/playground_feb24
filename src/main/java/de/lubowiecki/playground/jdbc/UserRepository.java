package de.lubowiecki.playground.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserRepository implements Repository<User> {

    private final String TABLE = "users";

    @Override
    public boolean insert(User user) throws SQLException {
        try(Connection dbh = DbUtils.getConnection();
            Statement stmt = dbh.createStatement()) {

            final String SQL = "INSERT INTO %s (id, firstname, lastname, email) VALUES(null, '%s', '%s', '%s')";
            return stmt.executeUpdate(String.format(SQL, TABLE, user.getFirstname(), user.getLastname(), user.getEmail())) > 0;
        }
    }

    @Override
    public boolean update(User user) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(User user) throws SQLException {
        return false;
    }

    @Override
    public List<User> find() throws SQLException {
        return null;
    }

    @Override
    public User find(int id) throws SQLException {
        return null;
    }

    @Override
    public User create(ResultSet result) throws SQLException {
        return null;
    }
}
