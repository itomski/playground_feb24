package de.lubowiecki.playground.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    // CRUD

    boolean insert(T t) throws SQLException;
    boolean update(T t) throws SQLException;

    boolean delete(T t) throws SQLException;

    boolean delete(int id) throws SQLException;


    List<T> find() throws SQLException;
    T find(int id) throws SQLException;

    // Mappt relationale Daten in Objekte
    T create(ResultSet result) throws SQLException;

    void createTable() throws SQLException;

}
