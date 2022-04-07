package program_26_encapsulation;

public class Encapsulation {
    //Private variables declared these can only be acessed by public methods of class
    private String name;
    private int rollNo;
    private int age;

    //set method name for name to access private variable name
    public void setName(String name){
        this.name=name;
    }
    //get method for name to access private variable name
       public String getName(){
        return name;
       }
       //set method rollNo to access private variable rollNo
    public int getRollNo(){
        return rollNo;
    }
    //set method for rollNo to acess private variable rollNo
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    //get method for age to access private variable age
    public int getAge(){
        return age;
    }
    //set mehod for age to access private variable age
    public void setAge(int age){
        this.age=age;
    }
}
