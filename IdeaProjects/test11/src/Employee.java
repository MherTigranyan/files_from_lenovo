public class Employee {
    String name;
    int age;
    String address;
    Employee(){
        System.out.println("datark konstruktor");
    }
    Employee(String name, String address, int age){
        this.address = address;
        this.age = age;
        this.name = name;
    }

}
