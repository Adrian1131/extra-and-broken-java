package edu.housatonic.fileio;
//////////////////////
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class ReadData {
	  public static void main(String[] args) throws IOException {
		  
		    File file = new File("Scores.txt");
		    Scanner input = new Scanner(System.in);
		    
		    while(input.hasNext()) {
		    	String f_name = input.next();
		    	String mi = input.next();
		    	String l_name = input.next();
		    	int score = input.nextInt();
		    	System.out.println(f_name + " " + mi + " " + l_name + " " + score);

		    }
		 input.close();
		 System.out.println("END OF PROGRAM.");
	  	}
	}

