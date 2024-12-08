import java.util.*;

public class AdventureGame {
   
    static class Room {
        String question;
        String answer;

        Room(String question, String answer) {
            this.question = question;
            this.answer = answer.toLowerCase();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("What is the name of the reindeer with a red nose?", "rudolph"));
        rooms.add(new Room("What Christmas beverage is also known as 'milk punch'?", "eggnog"));
        rooms.add(new Room("What is traditionally placed at the top of a Christmas tree?", "star"));
        rooms.add(new Room("What holiday movie features a boy left home alone?", "home alone"));
        rooms.add(new Room("What is Frosty the Snowman's nose made out of?", "button"));
        rooms.add(new Room("Which country started the tradition of putting up a Christmas tree?", "germany"));
        rooms.add(new Room("What Christmas treat is shaped like a shepherd's staff?", "candy cane"));
        rooms.add(new Room("What is the color of Santa Claus's suit?", "red"));
        rooms.add(new Room("How many reindeer pull Santa's sleigh, excluding Rudolph?", "8"));
        rooms.add(new Room("What is the name of the Grinch's dog?", "max"));
        rooms.add(new Room("What plant do people traditionally kiss under at Christmas?", "mistletoe"));
        rooms.add(new Room("What type of calendar counts down to Christmas?", "advent"));
        rooms.add(new Room("What is the name of the ballet set during Christmas?", "the nutcracker"));
        rooms.add(new Room("In the song 'Jingle Bells,' what is dashing through the snow?", "one horse open sleigh"));
        rooms.add(new Room("What fruit is often found in stockings?", "orange"));

        
        Collections.shuffle(rooms);

        System.out.println("Welcome to the Adventure Game!");
        System.out.println("Answer the questions correctly to move forward.");
        System.out.println("If you get one wrong, you'll have to start over!\n");

        
        int currentRoom = 0;

        while (currentRoom < rooms.size()) {
            Room room = rooms.get(currentRoom);
            System.out.println("Room " + (currentRoom + 1));
            System.out.println(room.question);

            System.out.print("Your answer: ");
            String playerAnswer = scanner.nextLine().trim().toLowerCase();

            if (playerAnswer.equals(room.answer)) {
                System.out.println("Correct! Moving to the next room.\n");
                currentRoom++;
            } else {
                System.out.println("Wrong! Restarting from the beginning.\n");
                currentRoom = 0;
                Collections.shuffle(rooms); 
            }
        }

        System.out.println("Congratulations! You have completed the adventure!");
        scanner.close();
    }
}