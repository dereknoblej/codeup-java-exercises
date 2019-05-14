public class ControlFlowExercises {
    public static void main(String[] args) {
//       int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
        for (byte i = 5; i <= 15; i++){
            System.out.println(i);
        }
//        long x = 2;
//        do{
//            System.out.println(x);
//            x *= x;
//
//        } while (x < 1000000);

        for(long x = 2; x < 1000000; x *= x){
            System.out.println(x);
        }






    }
}
