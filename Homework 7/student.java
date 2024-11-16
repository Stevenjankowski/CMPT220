/*
for this problem you need to:
1. create 5 different students in your main
2. create a method in this file that returns if they're an honor roll student or not (gpa > 3.6) then
check each of the students in main
3. create a method to see if they get "free lunch" (this is a weird school, every day they generate a random student id
and see if any students match that id, if they do they get free lunch that day, yay!) compare a randomly generated id and the
id of the student to print the appropriate response.
 */


import java.util.Random;

public class Student{
    String name;
    String year;
    double gpa;
    int id;
    public Student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
    
    public boolean isHonorRoll() {
        return gpa > 3.6;
    }

    
    public boolean getsFreeLunch(int randomId) {
        return id == randomId;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", "Freshman", 3.8, 101);
        Student student2 = new Student("Zach", "Sophomore", 3.2, 102);
        Student student3 = new Student("Charlie", "Junior", 3.9, 103);
        Student student4 = new Student("Randy", "Senior", 2.8, 104);
        Student student5 = new Student("Steve", "Freshman", 4.0, 105);

        Student[] students = {student1, student2, student3, student4, student5};
        
        System.out.println("Honor Roll Status:");
        for (Student student : students) {
            System.out.println(student.name + " is " + (student.isHonorRoll() ? "on" : "not on") + " the honor roll.");
        }

        Random random = new Random();
        int randomId = 101 + random.nextInt(5); 
        System.out.println("\nGenerated ID for free lunch: " + randomId);

        System.out.println("\nFree Lunch Status:");
        for (Student student : students) {
            if (student.getsFreeLunch(randomId)) {
                System.out.println(student.name + " gets free lunch!");
            } else {
                System.out.println(student.name + " does not get free lunch.");
            }
        }
    }

}
