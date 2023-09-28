import java.sql.*;
public class EX17{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st=conn.createStatement();
			st.execute("Delete from JavaCourse where Marks<66");
		}
		catch(Exception e){}
	}
}