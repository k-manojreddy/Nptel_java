import java.sql.*;
public class EX18{
	public static void main(String[] args){
		int t=0,k=0;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("Select * from JavaCourse");
			//ResultSet rs=st.getResultSet();
			while(rs.next()){
				t=t+Integer.parseInt(rs.getString("Marks"));k++;
				System.out.println("Name:"+rs.getString("Name")+"\tRollNo:"+rs.getString("RollNumber")+"\tMarks:"+rs.getString("Marks")+"\tGrade:"+rs.getString("Grade"));
			}
			System.out.println("Average Marks:"+(t/k));
			System.out.print("Total Marks:"+t);
		}
		catch(Exception e){
    System.out.println("Error: " + e.getMessage());
    e.printStackTrace();
}

	}
}