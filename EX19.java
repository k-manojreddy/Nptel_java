import java.sql.*;
public class EX19{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			/*Statement st=conn.createStatement();
			st.execute("Delete from JavaCourse(RollNumber,Name,Marks,Grade) where Marks<66");*/
			PreparedStatement ps=conn.prepareStatement("Insert into JavaCourse values(?,?,?,?)");
ps.setInt(1,6);ps.setString(2,"Ram");ps.setString(4,"G");ps.setInt(3,26);
//ps.setInt(1,7);ps.setString(2,"John");ps.setString(4,"M");ps.setInt(3,22);
ps.execute();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}