/**
 * Created by ash2015 on 10/26/18.
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Exceptions.DatabaseException;

public class Database {

    protected Connection connection;


    Database(){
        try {
            Statement statement = null;
            statement = connection.createStatement();

            statement.executeUpdate("drop table if exists ");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    protected void openConnection() throws DatabaseException {
        try {
//            final String CONNECTION_URL = "jdbc:sqlite:spellcheck.sqlite";
//            connection = DriverManager.getConnection(CONNECTION_URL);
//            connection.setAutoCommit(false);

        }
        catch (SQLException e) {
            throw new DatabaseException("Failed to open connection.");
            e.printStackTrace();
        }
    }


    protected void closeConnection(boolean commit) throws DatabaseException {
        try {
            if (commit) {
                connection.commit();
            }
            else {
                connection.rollback();
            }
            connection.close();
            connection = null;
        }
        catch (SQLException e) {
            throw new DatabaseException("Failed to close connection.");
        }
    }

}
