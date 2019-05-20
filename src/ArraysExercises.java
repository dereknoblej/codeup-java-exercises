import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
//        Person[] id = {new Person("Derek"),new Person("Jake"), new Person("Nick")};
        Person[] id = new Person[4];
        id[0] = new Person("Derek");
        id[1] = new Person("Jake");
        id[2] = new Person("Nick");

        System.out.println(id[2].getName());
        System.out.println(addPerson(id, new Person("Jack")));


    }
    public static String addPerson(Person[] id, Person jack){
        Person[] newId = Arrays.copyOf(id , id.length);
        newId[newId.length - 1] = jack;
        return  newId[newId.length - 1].getName();
    }

}
