package package_repeat_homework_week8;

public class Program_25_ConstructorOverloading {
    //Java program to overload constructor

    int id;
    String name;
    int age;

    //creating two arg constructor
    Program_25_ConstructorOverloading(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Program_25_ConstructorOverloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void disply() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Program_25_ConstructorOverloading s1 = new Program_25_ConstructorOverloading(111, "Karan");
        Program_25_ConstructorOverloading s2 = new Program_25_ConstructorOverloading(222, "Aryan", 25);
        s1.disply();
        s2.disply();
    }
}
