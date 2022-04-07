package Program_23_method_overriding;
/**
 * Java Program to illustrate the use of Java Method Overriding
 * Creating a parent class.
 */
public class Bike extends Vehicle {
   //defining the same method as in the parant class
    public void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike obj=new Bike();//creating object
        obj.run();//calling method
    }
}
