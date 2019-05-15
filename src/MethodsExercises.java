import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many sided dice?");
        int num = sc.nextInt();
        System.out.println("Would you like to roll the dice?");
        String answer = sc.next();
        if (answer.equals("yes")){
            System.out.println(diceOne(num));
            System.out.println(diceTwo(num));
        } else {
            System.out.println("ok");
        }

//        String userInput = getInteger(1, 10);
//        System.out.println(userInput);
//            long num = factorial(3);
//        System.out.println(num);


//            System.out.println(timesThree(3));
//        System.out.println(additionTwo(2));
//        System.out.println(subtractionOne(4));
//        System.out.println(divisionTwo(6));
//        System.out.println(modTwo(4, 3));
    }



    public static int diceOne(int x){
        Random rand = new Random();
        return rand.nextInt(x);
    }
    public static int diceTwo(int x){
        Random rand = new Random();
        return rand.nextInt(x);
    }


















//    public static String getInteger(int min, int max){
//        System.out.println("Please enter a number between 1 and 10");
//        Scanner sc = new Scanner(System.in);
//        int userNumber = sc.nextInt();
//        if(min < userNumber && max > userNumber){
//          return String.format("Your number %d is between %d and %d", userNumber, min, max);
//        } else {
//           return String.format("You number %d is not between %d and %d", userNumber, min, max);
//        }
//    }
//    public static boolean betweenOneAndTen(int x){
//        if (x > 0 && x < 11){
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public static long factorial(int x) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number between 1 and 10");
//        int num = sc.nextInt();
//        System.out.printf("This is your number %d, would you like to continue", num);
//        String confirm = sc.next();
//        if (confirm.equals("yes")) {
//        if (betweenOneAndTen(num)) {
//            long fac = 1;
//            for(int i = 2; i <= num; i++ ){
//
//                fac = fac * i;
//                System.out.println(fac);
//                if(i+1 == num){
//                    return fac * num;
//                }
//            }
//            } else {return 0;}
//
//        } else { return 0; }
//        return 0;
//    }
//














//    public static int additionTwo (int x){
//        return x + 2;
//    }
//    public static int subtractionOne (int x){
//        return x - 1;
//    }
//    public  static int timesThree(int num){
//        return num * 3;
//    }
//    public static int divisionTwo(int x){
//        return x / 2;
//    }
//    public static String modTwo (int x, int y){
//        x = x % 2;
//        y = y % 2;
//        return String.format("x: %d y: %d", x, y);
//    }












}
