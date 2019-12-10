package BulletShowroomManagement;

import java.sql.SQLException;
import java.util.Scanner;

public class Bullet {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			ConnectionMM con = new ConnectionMM();
			   Bullet b = new  Bullet();
			   b.choice();
			}
			   public void choice() throws ClassNotFoundException, SQLException {

			Scanner s = new Scanner(System.in);
			int n;
			System.out.println("**Welcome to RoyalEnfield Showroom-Kollam**\n");

			System.out.println("1.Customer\n2.Service Provider\n3.Display\n4.Exit");
			System.out.println("Select your choice:");
			n = s.nextInt();
			switch(n) {
			case 1:
			Customer cust = new Customer();
			cust.details1();
			cust.custData();
			break;
			case 2:
			Serviceprovider serv = new Serviceprovider();
			serv.details();
			serv.servData();
			break;
			case 3:
			Display display = new Display();
			display.details();
			display.displayData();
			break;
			case 4:
			System.out.println("Process will be Completed");
			System.exit(0);	
			}

	}

}
