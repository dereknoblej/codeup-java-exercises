import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 10) {
            System.out.println("Please talk to Bob.");
            String userResponse = sc.nextLine();
            int num = userResponse.indexOf("?");
            int exclaim = userResponse.indexOf("!");
            if (num > -1) {
                System.out.println("Sure");
            } else if (exclaim > -1) {
                System.out.println("Whoa, chill out!");
            } else if (userResponse.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

            i++;

        }
    }
}
