import java.sql.*;
import java.util.Scanner;

public class DbDataHandling{
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

			System.out.print("Enter employee id: ");
			eId=scanner.nextInt();

			System.out.print("Enter employee name: ");
			eName=scanner.next();

			System.out.print("Enter employee pay: ");
			pay=scanner.nextDouble();

			String sql="insert into EmployeeTb(EId,EName,Pay) values (?,?,?)";

			preparedStatement=_conn.prepareStatement(sql);
			preparedStatement.setInt(1,eId);
			preparedStatement.setString(2,eName);
			preparedStatement.setDouble(3,pay);

			preparedStatement.execute();
			System.out.println("Data Inserted Successfully!");
		}catch(Exception ex){ ex.printStackTrace(); }
	}
}
