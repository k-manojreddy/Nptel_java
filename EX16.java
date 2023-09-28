import java.sql.*;
public class EX16{
	public static void main(String[] args){
		Connection conn=null;
		Statement st=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			st=conn.createStatement();
			st.execute("Update JavaCourse set Name='Debasis',Marks=90,Grade='EX' where RollNumber=1");
		}
		catch(Exception e){}
	}
}