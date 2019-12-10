package BulletShowroomManagement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Customer {

	
		Scanner s = new Scanner(System.in);
		
		
		
		ConnectionMM con = new ConnectionMM();

		
		public void details1() throws ClassNotFoundException, SQLException {
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
		// Customer cust = new Customer();
		//  cust.custData();
		}
		}
		//Bullet b = new Bullet();
		//b.choice();
		}



		void custData() throws ClassNotFoundException, SQLException {


		System.out.println("1.CUSTOMER DETAILS\n2.DISPLAY\n3.UPDATE\n4.LOGOUT");
		System.out.println("Enter the Choice");
		int m = s.nextInt();
		System.out.println("Enter the Adhar num");
		 int adhar = s.nextInt();
		switch(m) {
		case 1:
		   
		   System.out.println("Enter the Name:");
		   String name =s.next();
		   System.out.println("Enter the Address:");
		   String add =s.next();
		   System.out.println("Enter the Phone num");
		   int phno = s.nextInt();
		   System.out.println("Enter the Adhar num");
		   int adhar1 = s.nextInt();
		  
		   System.out.println("Enter the Salary");
		   int salary = s.nextInt();
		   
		   PreparedStatement st = (PreparedStatement) con.getConnection().prepareStatement("insert into customerdetails(Name,Address,Phonenumber,Adharnumber,Salary)values(?,?,?,?,?);");
		   st.setString(1, name);
		   st.setString(2, add);
		   st.setInt(3, phno);
		   st.setInt(4, adhar1);st.setInt(5, salary);
		   st.executeUpdate();
		   System.out.println("Customer details added successfully");
		   break;
		case 2:
		Statement s1= (Statement) con.getConnection().createStatement();
		ResultSet r=s1.executeQuery("select * from customerdetails ");

		while(r.next())
		{
			if(adhar==r.getInt(4))
			{

		   System.out.println("Name   :"+r.getString(1)+"\n"+"Address   :"+r.getString(2)+"\n"+"Phonenumber   :"+r.getInt(3)+"\n"+"Adharnumber   :"+r.getInt(4)+"\n"+"Salary   :"+r.getInt(5));
			}
		}
		Statement s11= (Statement) con.getConnection().createStatement();
		//ResultSet r1=s11.executeQuery("select * from enfielddetails");
		//while(r1.next())
		//{

		//   System.out.println("Serialno   :"+"Varient   :"+"On Road Price   :"+"Ex Showroom price   :"+"RTO+Others   :"+"Insurance");
		//System.out.println(r1.getInt(1)+" "+r1.getString(2)+" "+r1.getInt(3)+" "+r1.getInt(4)+" "+r1.getInt(5)+" "+r1.getInt(6));
		//}

		break;

		case 3:
		Statement s2= (Statement) con.getConnection().createStatement();
		ResultSet r2=s2.executeQuery("select * from customerdetails");

		while(r2.next())
		{
			if(adhar==r2.getInt(4))
			{

		System.out.println("Phno ->"+r2.getInt(3)+"\n"+"salary->"+r2.getInt(5));
		
		}}
		//int price=0;
		System.out.println("Enter the Adharnumber");
		int adh = s.nextInt();
		System.out.println("Enter the new phone number");
		int ph = s.nextInt();
		System.out.println("Enter the new salary");
		int sala = s.nextInt();
		PreparedStatement st1 =(PreparedStatement)con.getConnection().prepareStatement("update customerdetails set Phonenumber=?,Salary=? where Adharnumber=?");
		st1.setInt(1,ph);
		st1.setInt(2,sala);
		st1.setInt(3,adh );
		st1.executeUpdate();
		System.out.println("Price Update Successful");
		break;
		
		case 4:
		System.out.println("Customer Account Logout");
		return;
		}
		Customer cust = new Customer();
		cust.custData();

	
	
	}}