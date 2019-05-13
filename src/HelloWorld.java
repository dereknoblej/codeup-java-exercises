import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Test");

//        int myFavoriteNumber = 17;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "Time to go to lunch.";
//        System.out.println(myString);
//
//        myString = "c";
//        System.out.println(myString);
//
//        float myNumber;
//
//        myNumber = 3.14F;
//        System.out.println(myNumber);
//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//
//        x /= y;
//        y -= x;
//        System.out.println(y);
//


//        int practiceInt = 128;
//        long practiceNumber = practiceInt;
//        short practiceShort = (short) practiceInt;
//        practiceNumber += 1;
//        System.out.println(practiceNumber);
//
//        float practiceFloat = 3.14F;
//        System.out.println(practiceFloat);
//        int floatCast = (int) practiceFloat;
//        System.out.println(floatCast);
//
//        final int playableInt;
//        playableInt = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your cohort name.");
        String name = sc.next();
        System.out.printf("Hello there, %s. Nice to see you.%n", name);
        System.out.println("How many students are in your class?");

        int numberOfStudents = sc.nextInt();
        System.out.printf("Hi, %s! There are %d of you. %n", name, numberOfStudents);

    }
}
