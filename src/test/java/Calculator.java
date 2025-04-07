public class Calculator {
    public void add(int x, int y, float z){
        float sum = x+y+z;
        System.out.println("Sum of two numbers is: "+sum);

        float subtraction = x-y-z;
        System.out.println("Subtraction of two numbers is: "+subtraction);

        float multiplication = x*y*z;
        System.out.println("Multiplication of two numbers is: "+multiplication);

        int division = x/y;
        System.out.println("Division of two numbers is: "+division);

        float modules = x%y%z;
        System.out.println("Modules of two numbers is: "+modules);
    }
    public static void main(String[] args){
        Calculator cal = new Calculator();
        cal.add(5, 5, 8.99f);

    }
}
