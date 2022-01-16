package sample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Lockme {

	public static void main(String[] args) {
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Application Name:Lockers.me");
		System.out.println("Developer details: Chaitanya");
		int choice=0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Please select from below options");
		System.out.println("Enter 1 for adding file");
		System.out.println("Enter 2 for searching file");
		System.out.println("Enter 3 for write file");
		System.out.println("Enter 4 for printing contents");
		System.out.println("Enter 5 for deleting  file");
		System.out.println("Enter 6 for exit");
		
		choice=sc.nextInt();
		
		switch(choice) {
			case 1:
				try {  
					// create a file
		            File fcreate = new File("C:Fashion.txt");   
		            if (fcreate.createNewFile()) 
		            {  
		               System.out.println("File " + fcreate.getName() + " is created successfully."); 
		            } 
		            else 
		            {  
		               System.out.println("File is already exist in the directory.");  
		            }  
		          } 
		        catch (Exception exception) 
		        {  
		               System.out.println(exception);  
		        }
				break;
//		======================================================
			case 2:
				//file search
				try {
				  	File fsearch = new File("C:Fashion.txt"); 
				      if (fsearch.exists()) 
				      {   
				      System.out.println(fsearch.getName()+ " file is found.");  
				      }
				}
				catch (Exception e) 
				{
					System.out.println(e);
				}
				break;
//		=======================================================
			case 3:
				try {  
					// adding the content into existing file 
					// if not there will create new and edits
		            FileWriter fwrite = new FileWriter("C:Fashion.txt",true);
		            fwrite.write(" hello");  
			           fwrite.close();   
			           System.out.println("Edit was successful.");  
		         }
				catch (Exception e)
				{  
		            	System.out.println(e);       
		        }
				break;
//		=======================================================
			case 4:
				//print the contents of the file
				try {
				      FileReader fread = new FileReader("C:Fashion.txt"); 
				      Scanner sc1 = new Scanner(fread);
				      while (sc1.hasNextLine()) {
				        String data = sc1.nextLine();
				        System.out.println(data);
				        sc1.close();
				      }
				    } catch (Exception e) {
				      System.out.println();
				    }
				break;
//		=======================================================
			case 5:
				System.out.println("u have entered 5");
				File fdelete = new File("C:Fashion.txt");
					if(fdelete.exists()) {
						fdelete.delete();
						System.out.println(fdelete.getName()+ " file is deleted successfully.");
					} 
					else if(fdelete.exists()!=true)
			        {  
			        	System.out.println("file not there");  
			        }
					else {
						System.out.println("something went wrong");
					}
				break;
//		=======================================================
			case 6:
				System.out.println("u have entered 6");
				break;
//		=======================================================
			default:
				System.out.println("Wrong entry!!!!!.....Choose from given options.");
				
		}
		}
		while(choice!=6);
		System.out.println("You have came out of the transaction.\nThank you");
		sc.close();
	}
}

