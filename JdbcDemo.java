import java.sql.*;
class Jdbc{
    public static void main(String arg[]){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","password");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select  * from student");
            System.out.println("Roll no\t  Student Name\t\t  Branch\t  DOB");
            while(rs.next()){
                System.out.println(rs.getString(1)+"\t  "+rs.getString(2)+"\t\t  "+rs.getString(3)+"\t  "+rs.getString(4));
            }
        } catch (Exception e) {
           System.out.println(e.getMessage());

        }
    }
}