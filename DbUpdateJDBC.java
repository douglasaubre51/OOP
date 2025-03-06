import java.sql.*;
import java.util.Scanner;

public class DbUpdateJDBC{
	public static void main(String[] args){
		int eId;
		String eName;
		double pay;

		Connection _conn;
		PreparedStatement preparedStatement;

		Scanner scanner=new Scanner(System.in);

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url="jdbc:mysql://localhost:3306/EmployeeDb";
			String user="root";
			String password="password";

			_conn=(Connection)DriverManager.getConnection(url,user,password);

			System.out.print("Enter employee id to update: ");
			eId=scanner.nextInt();

			System.out.print("Enter new employee name: ");
			eName=scanner.next();

			String sql="update EmployeeTb set EName=? where EId=?";
			preparedStatement=_conn.prepareStatement(sql);

			preparedStatement.setString(1,eName);
			preparedStatement.setInt(2,eId);

			preparedStatement.execute();
			System.out.println("Data updated Successfully!");
		}catch(Exception ex){ ex.printStackTrace(); }
	}
}
