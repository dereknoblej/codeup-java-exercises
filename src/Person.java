public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){

        return this.name;
    }
    public void setName(String name){
       this.name = name;
    }
    public void sayHello(){
        System.out.printf("Hello my name is %s.%n", name);
    }

    public static void main(String[] args) {
//        Person derek = new Person();
//        derek.setName("Derek");
//        derek.sayHello();
//        System.out.println(derek.getName());

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());


    }

}

