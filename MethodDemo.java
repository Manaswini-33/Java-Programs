class Method{
    String name,sex, qual;
     int id, age, year;
    void personal_details(String name, String sex, int age){
        //'this' operator is used to differentiate between the local and instance varibales.
        this.name = name;
        this.age = age; 
        this.sex = sex;
        System.out.println("Personal Details: \n" + "Person name : " + this.name + "\nPerson age : " + this.age + "\nPerson Sex : " + this.sex);
    }
    void qual_details(String qual, int year){
        this.qual = qual;
        this.year = year;
        System.out.println("Qualification Details: \n" + "Qualifiaction : " + this.qual + "\nQualifiaction Year : " + this.year);
    }
}
public class MethodDemo {
    public static void main(String[] args) {
        Method obj1 = new Method();
        obj1.personal_details("Sweety", "Female", 18);
        obj1.qual_details("B.Tech", 2028);
    }
}
