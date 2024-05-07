package selenium.db;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class DBReadWrite {




    public static void setConnection() throws ClassNotFoundException, SQLException {

        Connection connection;
        Statement statement;
        ResultSet rs;

        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/MyDB", "root", "root");

        statement = connection.createStatement();

        rs = statement.executeQuery("select * from student");

        while (rs.next()) {

            System.out.print(rs.getString(1) + "\t");
            System.out.println(rs.getString(2));

        }

        statement.executeUpdate("insert into student values(1, 'devendra')");

        rs = statement.executeQuery("select * from student");

        while (rs.next()) {

            System.out.print(rs.getString(1) + "\t");
            System.out.println(rs.getString(2));

        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        setConnection();
    }



}
