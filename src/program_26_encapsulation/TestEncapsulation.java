package program_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        //setting values of the varibles
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        System.out.println("Prime's name :" + obj.getName());
        System.out.println("Prime's name :" + obj.getAge());
        System.out.println("Prime's name :" + obj.getRollNo());
        //Direct access of roll no is not possible due to encapsulation
        //  System.out.println("Prome's rollNo is :"+obj.geekName);

    }
}
