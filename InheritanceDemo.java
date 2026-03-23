class Animal
{
    void sleep()
    {
        System.out.println("Animal Sleeps.");
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat Sounds Meoww Meoww!!");
    }
    void drink()
    {
        System.out.println("Cat drinks milk.");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog Sounds Boww Boww!!");
    }
    void drink(){
        System.out.println("Dog drinks water.");
    }
}
public class InheritanceDemo {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.sound();
        cat.sleep();
        dog.sleep();
        dog.drink();
    }
}
