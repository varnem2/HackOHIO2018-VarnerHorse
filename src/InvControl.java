import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InvControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			
			String connectionURL = "jdbc:sqlserver://varnerhorse.database.windows.net:1433;database=Inventory;user=varner@varnerhorse;password=HackingHorse1;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
			
			Connection con = DriverManager.getConnection(connectionURL);
			
			con.close();
			
		}catch(ClassNotFoundException e) {
			System.err.println("Error finding class.");
			System.exit(43);
		}catch(SQLException e) {
			System.err.println(e);
			System.exit(42);
		}
	}

}
