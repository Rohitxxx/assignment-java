import java.sql.*;
class New{
    public static void main(String agr[]){
        try{
        
        Class.forName("com.mysql.jdbc.Driver");  //1
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","password");//2
        Statement st=con.createStatement();//3
        ResultSet rs=st.executeQuery("select * from student"); //4
        while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
        }
    }catch(ClassNotFoundException e){
        System.out.println(e);
    }
    catch(SQLException e){
        System.out.println(e);
    }
     String s="rhot";
     String s1="maurya";
    System.out.println(s+s1);
    }
}