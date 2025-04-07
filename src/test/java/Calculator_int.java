public class Calculator_int {
    public void add(int x, int y){
        int sum = x+y;
        System.out.println("Sum of two numbers is: "+sum);

        int subtraction = x-y;
        System.out.println("Subtraction of two numbers is: "+subtraction);

        int multiplication = x*y;
        System.out.println("Multiplication of two numbers is: "+multiplication);

        int division = x/y;
        System.out.println("Division of two numbers is: "+division);

        int modules = x%y;
        System.out.println("Modules of two numbers is: "+modules);
    }
    public static void main(String[] args){
        Calculator_int cal = new Calculator_int();
        cal.add(5, 9);

    }
}
