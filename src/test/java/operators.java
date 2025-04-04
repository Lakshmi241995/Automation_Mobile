public class operators {

    public static void main(String[] args) {
        //Arithematic Operators
        System.out.println("ARITHEMATIC OPERATORS");
        int x=3;
        int y=2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        int a=10,b=5,m=9,n=7;
        System.out.println(a/b);
        System.out.println( a%b);
        m++;
        System.out.println("Increment: "+m);
        n--;
        System.out.println("Decrement: "+n);
        ++m;
        System.out.println("Increment: "+m);
        --n;
        System.out.println("Decrement: "+n);


        //Logical Operators
        System.out.println("LOGICAL OPERATORS");
        System.out.println(x>y && b>x); // Logical AND "Wrong"
        System.out.println(x>1 || y>b); // Logical OR
        System.out.println(x!=y);  //Logical NOT

        //Comparison Operators
        System.out.println("COMPARISON OPERATORS");
        int c=9,d=4,e=6;
        System.out.println(b==c);   // Equal
        System.out.println(e!=d);  // Not equal
        System.out.println(x<y);  // Less than
        System.out.println(b<=y);  //Less than or equal
        System.out.println(d>x);   //Greater than
        System.out.println(d>=d);  //Greater than or equal

        //String Operator
        System.out.println("String OPERATOR");
        System.out.println("JAVA beginner"+" "+"learning Automation");
        System.out.println('A'+ "BC");

    }
}
