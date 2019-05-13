import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pis is approx. %f %n", pi);
        Scanner sc = new Scanner(System.in);
//        System.out.println("User! Please enter a number.");
//        int userNumber = sc.nextInt();
//        System.out.println("User! Enter 3 words.");
//        String userWords = sc.next();
//        String userWords2 = sc.next();
//        String userWords3 = sc.next();
//        System.out.printf("user word %s, %s, %s %n", userWords, userWords2, userWords3);
//        System.out.println("User! Enter a damn sentence.");
//        String userSentence = sc.nextLine();
//        System.out.printf("This is the user's sentence: %s", userSentence);
        System.out.println("What is the length of the classroom you are in?");
        float lengthRoom = sc.nextFloat();
        System.out.println("What is the width of the classroom?");
        float widthRoom = sc.nextFloat();
        System.out.println("What is the height of the classroom?");
        float heightRoom = sc.nextFloat();
        float perimeter = (widthRoom * 2) + (lengthRoom * 2);
        System.out.println(perimeter);
        float volumeRoom = widthRoom * heightRoom * lengthRoom;
        System.out.printf("The volume of the room is %f. %n", volumeRoom);






    }
}
