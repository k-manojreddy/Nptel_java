import java.sql.*;
public class EX13{
	public static void main(String[] args){
		Connection conn=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			                                //Path and Port of DataBase,UserName,Password
			System.out.println("DataBase Connection Established"+conn.isValid(1));
		}
		catch(Exception e){
			System.out.println("Cannot Connect to DataBase"+e);
		}
		finally{
			if(conn!=null){
				try{
					conn.close();
					System.out.println("connection terminated"+!conn.isValid(1));
				}
				catch(Exception e){}
			}
		}
	}
}
		