package oopss.abstraction;

import java.sql.*;

public class NumberExample {

    public static void main(String[] args) {

        // her Number is an abstract class and does not worry about the implementation;
        Number number = Test.m1();

        System.out.println(number);

    }
}

class Test{

    public static float m1() {
        return 10.0f;
    }
}


class Test1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/MyDB", "root", "root");

        // here we are using connection interface without going into internal details of how we are connecting with mysql db
        Statement stmt = connection.createStatement();

        // here we re getting result set in rs without worring about implementation details
        ResultSet rs = stmt.executeQuery("select * from student");

        System.out.println(rs);

        while(rs.next()) {

            System.out.println("inside resultset");
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("rollnumber"));
        }

        rs.close();
        connection.close();

    }
}
