public class MethodsExercises {
    public static void main(String[] args) {

            System.out.println(timesThree(3));
        System.out.println(additionTwo(2));
        System.out.println(subtractionOne(4));
        System.out.println(divisionTwo(6));
        System.out.println(modTwo(4, 3));
    }
    public static int additionTwo (int x){
        return x + 2;
    }
    public static int subtractionOne (int x){
        return x - 1;
    }
    public  static int timesThree(int num){
        return num * 3;
    }
    public static int divisionTwo(int x){
        return x / 2;
    }
    public static String modTwo (int x, int y){
        x = x % 2;
        y = y % 2;
        return String.format("x: %d y: %d", x, y);
    }












}