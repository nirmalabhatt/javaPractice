
import java.sql.*;
public class joinjdbc {
    public static void main(String [] args)
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver loaded successfully!");

            conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP_UPAUKN55:1521/XE","nirmala","niru");
            System.out.println("Connection opened successfully!");

            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select rol_no,s_name,per from students");
            while(rs.next())
            {
                int rol_no=rs.getInt(1);
                String s_name=rs.getString(2);
                int per=rs.getInt(3);
                System.out.println(rol_no+ s_name+"\t"+per);
            }

        }
        catch(ClassNotFoundException cnfe)
        {
            System.out.println("Cannot load the driver class");

        }
        catch(SQLException ex)
        {
            System.out.println("Error in DB");
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                if(conn!=null)
                {
                    conn.close();
                    System.out.println("Connection closed successfully!");
                }
            }
            catch(SQLException ex)
            {
                System.out.println("Problem in closing the connection");
            }
        }
    }

}
