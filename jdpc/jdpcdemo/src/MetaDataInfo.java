import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;

public class MetaDataInfo {
    public static void main(String[] args) {

        try{
        Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver connected");
        
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Company","root","root");
           System.out.println("Connected to Company database");

           DatabaseMetaData dmd = (DatabaseMetaData) con.getMetaData();
           String product_name=dmd.getDatabaseProductName();
           int version =dmd.getDatabaseMajorVersion();

           System.out.println("Product name :\t"+product_name);
           System.out.println("version:\t"+version);

           ResultSet rs =dmd.getColumns(null, null, "emp", null);
           while (rs.next()) {
            System.out.println("Column name:\t"+rs.getString("TYPE_NAME")+"size:\t"+rs.getInt("COLUMN_SIZE"));
            
           }


        } catch (Exception e) {
            e.printStackTrace();
    }
        
}
}