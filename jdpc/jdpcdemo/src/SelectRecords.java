import java.sql.Connection;
import java.sql.DriverManager;

public class SelectRecords {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver connected");
        
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Company","root","root");
           System.out.println("Connected to Company database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
