package com.Harman.DatabaseSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		try {
			Connection c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false","root","");
		Scanner s =new Scanner(System.in);
		String Name,Rollno,Admno,College;
		System.out.println("Enter Name :");
		Name=s.nextLine();
		System.out.println("Rollno :");
		Rollno=s.nextLine();
		System.out.println("Admno :");
		Admno=s.nextLine();
		System.out.println("College :");
		College=s.nextLine();
		
		Statement stmt=c.createStatement();
		stmt.executeUpdate("INSERT INTO student( `Name`, `rollno`, `admno`, `college`) VALUES('"+Name+"',"+Rollno+","+Admno+",'"+College+"')");
		System.out.println("Inserted Successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
