package hms;
import java.sql.*;

public class ConnectingDatabase 
{
	Connection connection;
	Statement statement;
	
	public ConnectingDatabase() 
	{
		try
		{		
			
			Class.forName("oracle.jdbc.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@krishna:1521:xe","system","hr");
			statement=connection.createStatement();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
