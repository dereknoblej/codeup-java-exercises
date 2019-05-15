import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number between 1 and 10");
        String userInput = getInteger(1, 10);
        System.out.println(userInput);



//            System.out.println(timesThree(3));
//        System.out.println(additionTwo(2));
//        System.out.println(subtractionOne(4));
//        System.out.println(divisionTwo(6));
//        System.out.println(modTwo(4, 3));
    }
    public static String getInteger(int min, int max){
        System.out.println("Please enter a number between 1 and 10");
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        if(min < userNumber && max > userNumber){
          return String.format("Your number %d is between %d and %d", userNumber, min, max);
        } else {
           return String.format("You number %d is not between %d and %d", userNumber, min, max);
        }
    }














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
