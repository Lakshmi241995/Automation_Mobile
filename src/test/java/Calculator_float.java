public class Calculator_float {
    public void add(float x, float y){
        float sum = x+y;
        System.out.println("Sum of two numbers is: "+sum);

        float subtraction = x-y;
        System.out.println("Subtraction of two numbers is: "+subtraction);

        float multiplication = x*y;
        System.out.println("Multiplication of two numbers is: "+multiplication);

        float division = x/y;
        System.out.println("Divison of two numbers is: "+division);

        float modules = x%y;
        System.out.println("Modules of two numbers is: "+modules);
    }
    public static void main(String[] args){
        Calculator_float cal = new Calculator_float();
        cal.add(5.33f, 6.55f);

    }
}
