class Parent
{
  //Properties
  int x = 10, id;
  String name;
  //Methods
  void display()
  {
    System.out.println("Parent Class.");
  }
  //Constructor
  Parent()
  {
    String name = "Manu";
    int id = 121;
    System.out.println("Parent Constructor.\n" + "Parent Details :- " + "\nParent Name : " + name + "\nParent id : " + id);
  }
}
class Child extends Parent
{
  int x = 20, id;
  String name;
  void display()
  {
    super.display();//Parent method
    System.out.println("Child Class."); 
  }
  void show()
  {
    System.out.println("Child class value = " + x);
    System.out.println("Parent class value = " + super.x);//Parent Variable
  }
  //Constructor
  Child(String name, int id)
  {
    this.name = name;
    this.id = id;
    super();
    System.out.println("Child Constructor.\n" + "Child Details :- " + "\nChild Name : " + this.name + "\nChild id : " + this.id);
  }
}
class SuperDemo
{
  public static void main(String[] args)
  {
     Child obj = new Child("Divya",5);
     obj.show();
     obj.display();
  }
}