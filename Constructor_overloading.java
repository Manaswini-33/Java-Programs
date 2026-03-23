class Employee{
    //Instance variables
    String empname,  emp_dept;
    int emp_id, emp_age,count = 0;
    float emp_sal;
    //Constructor
    Employee(String empname, String emp_dept, int emp_id, int emp_age, float emp_sal){
        this.empname = empname;
        this.emp_dept = emp_dept;
        this.emp_id = emp_id;
        this.emp_age = emp_age;
        this.emp_sal = emp_sal;
        count++;
    }
    //Constructor overloading
    Employee(String empname, String emp_dept, int emp_id, int emp_age){
         this.empname = empname;
        this.emp_dept = emp_dept;
        this.emp_id = emp_id;
        this.emp_age = emp_age;
        count++;
    }
    Employee(){
        empname = "Null"; 
        emp_dept = "N/A";
        emp_age = 0;
        emp_id = 0;
        count++;
    } 
    //Methods
    void display_details(){
        System.out.println("Employee Details: \n" +
                           "Employee name : " + this.empname + 
                           "\nEmployee ID : " + this.emp_id + 
                           "\nEmployee age : " + this.emp_age + 
                           "\nEmployee dept : " + this.emp_dept + 
                           "\nEmployee Salary : " + this.emp_sal
                        );
    }
    //Method overloading
        void display_details(String msg){
           System.out.println(msg);
           display_details();
    }
}
public class Constructor_overloading {
    
    public static void main(String[] args) {
        Employee obj = new Employee("Manu", "Developer", 121, 19, 75000);
        obj.display_details("Employee Information: \n");
        System.out.printf("Employee count = " + obj.count);
        
    }
}
