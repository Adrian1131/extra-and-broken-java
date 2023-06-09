package edu.housatonic.fileio;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

public class WriteData {
	PrintWriter output ;
  public static void main(String[] args)  {
    File file = new File("scores.txt");
    
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    // Create a file
    PrintWriter  output = null;
    try {
         output = new PrintWriter(file);
         // Write formatted output to the file
         output.print("John T Smith ");
         output.println(90);
         output.print("Eric K Jones ");
         output.println(85);
         output.print("Mary H Smith ");
         output.println(99);
         output.print("Sue A Brown ");
         output.println(73);
    }
    
    catch (FileNotFoundException ex) {
    	ex.printStackTrace();
    }
    
 // Close the file
    finally {
       output.close();
    }
    
    
  }
}