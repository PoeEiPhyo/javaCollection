package Collection;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	public static void main(String[] args) throws IOException {
		String str="";
		String st="";
		// TODO Auto-generated method stub
		
		do {
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name:");
			String name=sc.nextLine();
			System.out.println("Enter Phone:");
			String phone=sc.nextLine();
			System.out.println("Enter Roll No:");
			String roll=sc.nextLine();
			System.out.println("Enter Address:");
			String address=sc.nextLine();
			
			Student s=new Student(name,phone,roll,address);
			
			try{
				File  file = new File("studentInformation.txt");
				OutputStream fw = new FileOutputStream(file);  
				ObjectOutputStream o = new ObjectOutputStream(fw);
				o.writeObject(s);
				o.close();
				fw.close();
	    
				FileInputStream fi = new FileInputStream("studentInformation.txt");
				ObjectInputStream oi = new ObjectInputStream(fi);
				
				Student s1;
				s1=(Student) oi.readObject();
				st+=s1.toString();
				System.out.println("\nStudent Information:\n"+st);				
				
				fi.close();
				oi.close();
		    }catch (FileNotFoundException e) {
					System.out.println("File not found");
			} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}

        System.out.println("Do you want to continue[yes/no]?");
	        str=sc.nextLine();
		}while(str.equals("yes"));
		
	}

}
