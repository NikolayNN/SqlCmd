package my.project;

import java.sql.*;

/**
 * Created by Nikol on 4/2/2016.
 */
public class Main {
    public static void main(String[] argv) throws ClassNotFoundException, SQLException {
        ConnectionToDB connectionToDB = new ConnectionToDB();
        Connection connection = connectionToDB.getConnect("sqlcmd","postgres", "root");
        Statement stmt = connection.createStatement();
        //insert
//        String sql = "INSERT INTO users VALUES ('Nikolay', '159357')";
//        stmt.executeUpdate(sql);

        //select

//        String query = "SELECT * FROM Users";
//
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                String name = rs.getString("name");
//                String password = rs.getString("password");
//                System.out.println(name +  " " + password);
//            }
        // delete
        String sql = "DELETE FROM Users WHERE Users.name='nikolay'";
        stmt.executeUpdate(sql);




        stmt.close();
        connection.close();

    }
}
