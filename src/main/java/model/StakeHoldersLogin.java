package model;
import java.io.IOException;

import java.util.Scanner;
import service.ExcelReader;
class PostLogin
{
	static void farmer()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter name of the crop you wanna sell:");
		String crop=s.nextLine();
		System.out.println("\n");
		System.out.println("Enter the quantity of crop you produced(in kgs) : ");
		int  quan=s.nextInt();
		System.out.println("Enter the base price at which you wanna sell you crop (per kg):");
		int base_f=s.nextInt();
	}
}
public class StakeHoldersLogin extends PostLogin
{
	public static void main(String[] args) throws IOException 
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Email : ");
		
		String email = sc.nextLine();
		System.out.print("Enter Your Password : ");
		
		String pass = sc.nextLine();

		ExcelReader vc = new ExcelReader();
		System.out.println("\n1:Farmer\n2.Wholesaler\n3.Retailer\n4.Civilian\nEnter your profession :");
		int prof=sc.nextInt();
		if(vc.validateCredentials(email,pass)) 
		{
			System.out.println("Logged in Successfully");
			switch(prof)
			{
			case 1: System.out.println("Congo!!! You are Logged in as a Farmer");
					farmer();
				break;
			case 2:System.out.println("Congo!!! You are Logged in as a Wholesaler");
				break;
			case 3:System.out.println("Congo!!! You are Logged in as a Retailer");
				break;
			case 4:System.out.println("Congo!!! You are Logged in as a Civilian");
				break;
			default:System.out.println("please try logging in again !");
			
			}
		}
		else 
		{
			System.out.println("Please Check your Credentials");
		}
		sc.close();
	}
}
 
