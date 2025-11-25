package com.example.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class db {
    private Connection connection;
    private Logger logger=Logger.getLogger(db.class.getName());

    public void getConnection() {
        try {
        if(connection==null||connection.isClosed()){
            connection= DriverManager.getConnection("jdbc:sqlite:note.db");
            logger.info("Database connection established");
            createTable();
        }
        }
        catch (SQLException ex) {
            logger.info("SQLException: " + ex.getMessage());

        }

    }
    private void closeConnection() throws SQLException {
       if(connection!=null|| !connection.isClosed()){
           connection.close();
       }
    }
    public void createTable() {
        getConnection();
        String query="CREATE TABLE IF NOT EXISTS notes(nam text not null primary key, email text not null, phone text not null ,dateofbirth text not null)";
       try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
           preparedStatement.executeUpdate();
           logger.info("Table created");
       }catch (SQLException e){
           logger.info("SQLException: " + e.getMessage());
       }
    }

    public void insertData(String nam, String email, String phone, String dateofbirth ) {
        getConnection();
        String query="INSERT INTO notes (nam,email,phone,dateofbirth) VALUES (?,?,?,?)";
        try(PreparedStatement statement= connection.prepareStatement(query)){
            statement.setString(1, nam);
            statement.setString(2, email);
            statement.setString(3, phone);
            statement.setString(4, dateofbirth);
            statement.executeUpdate();
            logger.info("Inserted");
        }
        catch (SQLException ex) {
            logger.info("SQLException: " + ex.getMessage());
        }
    }

public void updateData(String nam, String email, String phone, String dateofbirth) {
        getConnection();
    String query="update notes set email=?,phone=?,dateofbirth=? where nam=?";
    try(PreparedStatement preparedStatement= connection.prepareStatement(query)) {

        preparedStatement.setString(1, email);
        preparedStatement.setString(2, phone);
        preparedStatement.setString(3, dateofbirth);
        preparedStatement.setString(4, nam);
        preparedStatement.executeUpdate();
        logger.info("updated");
    }
    catch (SQLException ex) {
        logger.info("SQLException: " + ex.getMessage());
    }
}

}
