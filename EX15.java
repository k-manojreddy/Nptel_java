import java.sql.*;
public class EX15{
	public static void main(String[] args){
		Connection conn=null;
		Statement st=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			st=conn.createStatement();
			st.execute("Insert into JavaCourse Values(01,'Debasish',75,'A')");
			st.execute("Insert into JavaCourse Values(02,'Nilanjan',85,'EX')");
			st.execute("Insert into JavaCourse Values(03,'Tauheed',65,'B')");
			st.execute("Insert into JavaCourse Values(04,'Priyabrata',78,'A')");
		}
		catch (Exception e){}
	}
}