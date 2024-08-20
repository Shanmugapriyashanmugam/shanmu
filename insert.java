import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {
    public static void main(String[] args){
        try{
            String url="jdbc:mysql://localhost:3306/student_data";
            String user="root";
            String pass="root";
            Connection con=DriverManager.getConnection(url,user,pass);
            System.out.println("Connected");
            String t="insert into student_data profile values(?,?)";
            PreparedStatement st=con.prepareStatement(t);
            st.setInt(1,3);
            st.setString(2,"shanmu");
            st.execute();
            System.out.println("insert successfully");

            }catch(SQLException s){
                System.out.println(s);
            }
        }
}
