package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner = new Scanner(System.in);

      public String getString(){
          System.out.println("Please enter a sentence");
          String myString = scanner.nextLine();
          return myString;
        }
        public Boolean yesNo(){
            System.out.println("Please enter yes or no");
            String y = scanner.next();
          if(y.equals("y") || y.equals("yes")){
              return true;
          } else {
              return false;
          }
        }
      public int getInt(int min, int max){
          System.out.printf("Please enter a number between %d and %d", min, max);
          try {
              int userNumber = Integer.valueOf(scanner.nextLine());

          if(userNumber > min && userNumber < max){
              return userNumber;
          } else {
              return getInt(min,max);
          }} catch (NumberFormatException e){
              System.out.println("Number not entered");
              e.printStackTrace();
              return getInt(min, max);
          }
      }
      public double getDouble(double min, double max){
          System.out.printf("Please enter a number between %f and %f", min, max);
         try  {
          double userNumber = Double.valueOf(scanner.nextLine());
          if(userNumber > min && userNumber < max){
              Double.valueOf(userNumber);
              return userNumber;
          } else    {
              return getDouble(min,max);
          }}catch (NumberFormatException e){
             System.out.println("Double was not entered");
             e.printStackTrace();
             return getDouble(min,max);
         }
      }

}

