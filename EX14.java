import java.sql.*;
public class EX14{
	public static void main(String[] args){
		try{
			Connection conn=null;
			Statement s=null;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			s=conn.createStatement();
			String sr="Create table JavaCourse(RollNumber Integer Primary Key,Name Varchar(30),Marks Integer not null,Grade Varchar(2))";
			s.execute(sr);
		}
		catch(Exception e){
		}
	}
}
			