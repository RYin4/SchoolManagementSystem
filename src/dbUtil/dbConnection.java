package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassword";
    private static final String CONNECTION = "jdbc:mysql://localhost/login";
    private static final String SQLLITECONNECTION = "jdbc:sqllite:School.sqllite";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqllite.JDBC");
            return DriverManager.getConnection(SQLLITECONNECTION);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}


