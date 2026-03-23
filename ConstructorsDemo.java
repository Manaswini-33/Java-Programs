class Constructors{
    //Instance variables
    int id, age;
    String name, dept;
    Constructors(){//DEFAULT CONSTRUCTOR
        id = 121;
        age = 18;
        name = "Manaswini";
        dept = "AIML";
        System.out.println("DEFAULT CONSTRUCTOR");
        System.out.println("Student Details: \n" + "Student name : " + name + "\nStudent ID : " + id + "\nStudent age : " + age + "\nStudent dept : " + dept);
    }
    Constructors(int i, int age_no, String namee, String depart){//Parameterized Consrtuctor
        id = i;
        age = age_no;
        name = namee;
        dept = depart;
        System.out.println("PARAMETERIZED CONSTRUCTOR");
        System.out.println("Student Details: \n" + "Student name : " + name + "\nStudent ID : " + id + "\nStudent age : " + age + "\nStudent dept : " + dept);
    }
    Constructors(Constructors obj){
        id = obj.id;
        age = obj.age;
        name = obj.name;
        dept = obj.dept;
        System.out.println("COPY CONSTRUCTOR");
        System.out.println("Student Details: \n" + "Student name : " + name + "\nStudent ID : " + id + "\nStudent age : " + age + "\nStudent dept : " + dept);
    }
}
public class ConstructorsDemo{
    public static void main(String[] args) {
        Constructors obj1 = new Constructors();
        Constructors obj2 = new Constructors(38, 18, "Dhanush", "AIML" );
        Constructors obj3 = new Constructors(obj1);
    }
}