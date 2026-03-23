abstract class Shape
{
   //Methods
   //Abstract Methods
   abstract int area(int a, int b);
   abstract float ar(float a);
   void show()
   {
     System.out.println("Drawing a Shape.");
   }
}
abstract class Rectangle extends Shape
{
   //Properties
   int l, b;
   //Concrete Methods
   int area(int len, int brd)
   {
     l = len;
     b = brd;
     System.out.println("Area of Rectangle = " + (l * b));
     return l*b;
   } 
   void sides()
   {
      System.out.println("The quadrilateral has 4 sides.");
   }
}
class Square extends Rectangle
{
   //Methods
   float ar(float side)
   {
     System.out.println("Area of Square = " + (side * side));
     return side*side;
   } 
}
class Mutlilevel_InheritanceDemo
{ 
  public static void main(String[] args)
  {
     Square sq = new Square();
     sq.area(3,5);
     sq.sides();
     sq.show();
     sq.ar(4);
     sq.sides();
  }
}