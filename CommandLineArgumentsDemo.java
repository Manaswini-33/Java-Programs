class CommandLineArguments{
        String name, dept;
        int id, age;
}

public class CommandLineArgumentsDemo {
    public static void main(String[] args) {
    CommandLineArguments obj1 = new CommandLineArguments();
    if (args.length != 4){
        System.out.println("Usage: java CommandLineArguments <Name> <ID> <Age> <Department>");
        return;
    }
    try {
        obj1.name = args[0];
        obj1.id = Integer.parseInt( args[1]);
        obj1.age = Integer.parseInt(args[2]);
        obj1.dept = args[3];
        if (obj1.id <= 0 && obj1.age <= 0){
            System.out.println("Enter the numerical(int data-type) values: ");
            return;
        }
        System.out.println("Student details : \n Student Name: " + obj1.name + "\n Student ID: " + obj1.id + "\n Student age: " + obj1.age + "\n Student dept: " + obj1.dept);
    } catch (Exception e) {
        //Error handling
        System.out.println("id and age should be integer values.");
    }
    }
}
