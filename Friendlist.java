public class Friendlist {
    public static void main(String[] args) {
        
        String[] names = {"Alice", "Bob", "Steven", "Zach"};

       
        System.out.println("Using for loop:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        
        System.out.println("\nUsing for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}