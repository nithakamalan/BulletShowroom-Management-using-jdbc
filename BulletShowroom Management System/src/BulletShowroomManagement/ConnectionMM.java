package BulletShowroomManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class ConnectionMM {

	

		public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = null;
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/royalenfield","root","");
			if(con!=null)
			{
				return con;
			}
			else {
				return null;
			}
			
	

		}}
