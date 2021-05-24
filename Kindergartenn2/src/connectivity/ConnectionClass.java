package connectivity;

import java.sql.*;

public class ConnectionClass {
    public Connection getConnection() throws SQLException {
        String connectionUrl = "jdbc:sqlserver://localhost;database=Kindergarten;user=Omar;password=kindergarten123";
        Connection con = DriverManager.getConnection(connectionUrl);
        return con;
    }
}
