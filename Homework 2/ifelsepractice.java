//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {
        int myVariable = 25;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is 12+13? ");
        
        Scanner scanner = new Scanner(System.in);
        int inputnumber = scanner.nextInt();
        
        if (myVariable == inputnumber){
         System.out.println("Yes " + inputnumber + " is correct");
        }else{
            System.out.println("Yes " + inputnumber + " is incorrect");
        }
        int myVariable2 = 19;
        

        System.out.println("What is 9+10? ");
        
        
        int inputnumber2 = scanner.nextInt();
        
        if (myVariable2 == inputnumber2){
         System.out.println("Yes " + inputnumber2 + " is correct");
        }else{
            System.out.println("Yes " + inputnumber2 + " is incorrect");
        }
        int myVariable3 = 100;
        

        System.out.println("What is 10x10? ");
        
        
        int inputnumber3 = scanner.nextInt();
        
        if (myVariable3 == inputnumber3){
         System.out.println("Yes " + inputnumber3 + " is correct");
        }else{
            System.out.println("Yes " + inputnumber3 + " is incorrect");
        }




    }
}


