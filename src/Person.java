public class Person {
    private String name;

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
        Person derek = new Person();
        derek.setName("Derek");
        derek.sayHello();
        System.out.println(derek.getName());
    }

}

