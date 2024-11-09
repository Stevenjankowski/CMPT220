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
       
        File inputfile = new File("path/to/yourfile.txt"); 

        List<String> namesOver3_5 = new ArrayList<>(); 
        int totalNames = 0; 

        try {
            Scanner input = new Scanner(inputfile);

            
            while (input.hasNextLine()) {
                
                String name = input.nextLine();
                
                
                double gpa = Double.parseDouble(input.nextLine());

                
                totalNames++;

                
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