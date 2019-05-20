import java.util.Arrays;

public class ServerNameGenerator {


    public static String getRandom(String[] myArray){
        int randomNumber = (int)(Math.random()*(10 - 1));
        System.out.println(randomNumber);
        return (myArray[randomNumber]);
    }

    public static void main(String[] args) {
        String[] arrayOne = {"short", "tall", "fat", "skinny", "blond", "brunette", "fast",
                "slow", "empty", "full"};
        String[] arrayTwo = {"rabbit", "fox", "barn", "house", "sun", "moon", "Earth", "eagle",
                "deer", "elk"};

        String adj = getRandom(arrayOne);
        String noun = getRandom(arrayTwo);

        System.out.println(adj + " " + noun);

    }

}
