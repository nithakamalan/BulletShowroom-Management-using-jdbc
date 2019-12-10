package BulletShowroomManagement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Serviceprovider {
	Scanner s = new Scanner(System.in);
	ConnectionMM con = new ConnectionMM();

	public void details() throws ClassNotFoundException, SQLException {
			System.out.println("UserName");
			String username = s.next();
			System.out.println("Password");
			String password = s.next();
			Statement s11= (Statement) con.getConnection().createStatement();
			ResultSet rr=s11.executeQuery("select * from customer");
			while(rr.next())
			{
			if(username.equals(rr.getString(1))&&password.equals(rr.getString(2))) {

			System.out.println("Login in..........");
			System.out.println("\n");
		
			}
			}
			
			}

	void servData()throws ClassNotFoundException, SQLException {
		
		System.out.println("1.Vechicle details\n2.Insurance Calculation\n3.Display\n4.Update\n5.Logout");
		System.out.println("Enter the Choice");
		int n = s.nextInt();
		switch(n) {
		case 1:
		  
		   System.out.println("Bullet Variant:");
		   String varient =s.next();
		   System.out.println("Model:");
		   int model=s.nextInt();
		   System.out.println("Color");
		   String color = s.next();
		   PreparedStatement st = (PreparedStatement) con.getConnection().prepareStatement("insert into royal(BulletVarient,Model,Color)values(?,?,?);");
		   st.setString(1,varient);
		   st.setInt(2,model );
		   st.setString(3,color );
		   st.executeUpdate();
		   System.out.println("Bullet details added successfully");
		   break;
		case 2:
			 System.out.println("Insurance Calculation:");
		
	}
	}

}
