import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectURL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String names = "C://feaifjio/fae/dgrgw /rshd/svv sr";
        String connectionUrl = "jdbc:sqlserver://localhost;database=myDB;user=user123;password=password111";
//        String user = "root";
//        String password = "";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            System.out.println("Connection established!");
            String SQL = "INSERT INTO Nums VALUES(" + n + ", '" + names + "');";
            stmt.executeUpdate(SQL);
//
//            // Iterate through the data in the result set and display it.
//            while (rs.next()) {
//                System.out.println(rs.getString("employee_id") + " " + rs.getString("last_name"));
//            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}