public class Method_overloading {
    int add(){//Differ in order
        int a, b;
         a = 10;
         b = 20;
         return a+ b; 
    }
    double add(double a, double b){//Differ in type
          return a + b;
    }
    int add(int a, int b, int c){//Differ in no. of parameters
        return a + b + c;
    }
    public static void main(String[] args) {
        Method_overloading obj = new Method_overloading();
        System.out.println(" Sum of two unparameterized (int) values: " + obj.add());
        System.out.println(" Sum of three (int) values: " + obj.add(3, 2, 5));
        System.out.println(" Sum of two (double) values: " + obj.add(2.47, 6.56));
    }
}
