package my.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Nikol on 4/5/2016.
 */
public class ConnectionToDB {
    public Connection connection;

    public Connection getConnect(String dbName, String login, String password){
        if (connection != null){
            return connection;
        }
        try {
        Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/" + dbName, login, password);
        } catch (SQLException e) {
            System.out.println("Connection fail " + e);
        }catch (ClassNotFoundException e){
            System.out.println("Connection fail " + e);
        }
        return connection;
    }

    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection was not closed");
        }
    }

    public static void main(String[] args) {
        
    }

}
