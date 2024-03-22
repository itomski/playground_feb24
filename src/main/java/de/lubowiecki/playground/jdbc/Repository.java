package de.lubowiecki.playground.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    boolean insert(T t) throws SQLException;
    boolean update(T t) throws SQLException;
    boolean delete(T t) throws SQLException;
    List<T> find() throws SQLException;
    T find(int id) throws SQLException;

    T create(ResultSet result) throws SQLException;

}
