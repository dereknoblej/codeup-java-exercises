package movies;
import java.util.Scanner;
import java.lang.reflect.Array;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        String userAnswer = sc.nextLine();

        if(userAnswer.equals("0")){
            System.out.println("Thank you come again");
        } else if(userAnswer.equals("1")){
            System.out.println(displayMovies());
        }else if(userAnswer.equals("2")){
            System.out.println(displaybyCategory("animated"));
        } else if(userAnswer.equals("3")){
            System.out.println(displaybyCategory("drama"));
        }else if(userAnswer.equals("4")){
            System.out.println(displaybyCategory("horror"));
        } else if(userAnswer.equals("5")){
            System.out.println(displaybyCategory("scifi"));
        } else {
            System.out.println("You did not enter a valid response.");
        }

    }


    public static String displayMovies(){
        Movie[] movie = MoviesArray.findAll();
        String movies = "";
        for(int i = 0; i< movie.length; i++){
            movies += (movie[i].getName() + " " + movie[i].getCategory() + "\n" );
        }
        return movies;
    }
    public static String displaybyCategory(String category){
        Movie[] movie = MoviesArray.findAll();
        String categories;
        String movies = "";
        for(int i = 0; i< movie.length; i++){
            categories = movie[i].getCategory();
            if(categories.equals(category)){
                movies += (movie[i].getName() + " " + movie[i].getCategory() + "\n");
            }
        }
        return movies;
    }
}
