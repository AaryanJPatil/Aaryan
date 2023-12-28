import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedInsert {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try {Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver connected");
        
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Company","root","root");
           System.out.println("Connected to Company database");

           //Insert value from user

          /*  System.out.println("Enter user id");
           int user_id=sc.nextInt();

           System.out.println("Enter user name");
           String user_name=sc.next();

           System.out.println("Enter user age");
           int user_age=sc.nextInt();*/

           


           PreparedStatement psmt =con.prepareStatement("insert into emp (id,name,age)values(?,?,?)");
           psmt.setInt(1,user_id);
           psmt.setString(2,user_name);
           psmt.setInt(3,user_age);
           

           int r =psmt.executeUpdate();

           if(r==1)
            System.out.println("Records inserted succesfully"+r);
            else
                System.out.println("something went wrong"+r);

            
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}