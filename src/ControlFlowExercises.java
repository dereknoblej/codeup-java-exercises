import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////       int i = 5;
////        while (i <= 15){
////            System.out.println(i);
////            i++;
////        }
//        for (byte i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
////        long x = 2;
////        do{
////            System.out.println(x);
////            x *= x;
////
////        } while (x < 1000000);
//
//        for(long x = 2; x < 1000000; x *= x){
//            System.out.println(x);
//        }
//
//    for(int i = 1; i <= 100; i++){
//        if(i % 3 == 0 && i % 2 != 0){
//            System.out.println("Fizz");
//        }
//        if(i % 2 == 0 && i % 3 != 0){
//            System.out.println("Buzz");
//        }
//        if(i % 2 == 0 && i % 3 == 0){
//            System.out.println("FizzBuzz");
//        }
//        System.out.println(i);
//    }
        System.out.println("Please enter a number");
        int userNumber = sc.nextInt();
        String leftAlignFormat = "| %-6d | %-6d |%-6d |%n";

        System.out.format("+-----------------+------+%n");
        System.out.format("| Number | Squared|Cubed |%n");
        System.out.format("+-----------------+------+%n");
        for (int i = 1; i <= userNumber; i++) {
            int square = (int)Math.pow(i, 3);
            System.out.format(leftAlignFormat, i, i * i, square);
        }
        System.out.format("+-----------------+------+%n");

        System.out.println("Please enter your grade.");
        int userGrade = sc.nextInt();
        if(userGrade >= 88){
            System.out.printf("%d is an A", userGrade);
        }
        if (userGrade >= 80 && userGrade <= 87){
            System.out.printf("%d is a B", userGrade);
        }
        if (userGrade >= 67 && userGrade <= 79){
            System.out.printf("%d is a C", userGrade);
        }
        if (userGrade >= 60 && userGrade <= 66){
            System.out.printf("%d is a D", userGrade);
        }
        if (userGrade <= 59){
            System.out.printf("%d is a F", userGrade);
        }





    }
}
