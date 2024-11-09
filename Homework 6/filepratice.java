//This is assuming you have your file in the correct directory, i included a reference of where your txt file should be in the brightspace assignment
//based off what we learned in class about files, you need to determine how it's best to read the text file included in the assignment 
//after you've read and kept track of the text, then i need you to figure out:
/*
1. what names had over a 3.5 gpa (using coding, of course, not your eyes)
2. how many names are there total?
*/
//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class filepratice {
    public static void main(String[] args){
        // Path to the file (update with the correct path)
        File inputfile = new File("path/to/yourfile.txt"); 

        List<String> namesOver3_5 = new ArrayList<>(); // Stores names with GPA > 3.5
        int totalNames = 0; // Total count of names in file

        try {
            Scanner input = new Scanner(inputfile);

            // Loop through each pair of lines in the file
            while (input.hasNextLine()) {
                // Read name from the first line
                String name = input.nextLine();
                
                // Read GPA from the second line and parse it
                double gpa = Double.parseDouble(input.nextLine());

                // Increment total name count
                totalNames++;

                // Check if GPA > 3.5 and add name to list if true
                if (gpa > 3.5) {
                    namesOver3_5.add(name);
                }
            }
            
            input.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Names with GPA over 3.5: " + namesOver3_5);
        System.out.println("Total number of names: " + totalNames);
    }
}