public class Operators {
    public static void main(String[] args) {
        // ARITHMETIC OPERATORS
        int a = 7;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        int num = 6;
        num = num + 2;
        num += 3;
        num++;      // post increment
        num--;      // post decrement
        ++num;      // pre increment
        --num;      // pre decrement

        System.out.println(num);


        // RELATIONAL OPERATORS
        
        int x = 7;
        int y = 5;

        System.out.println(x > y);
        System.out.println(x >+ y);
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x == y);
        System.out.println(x != y);


        // LOGICAL OPERATORS

        System.out.println(x>y && y<x);     // AND
        System.out.println(x>y || y<x);     // OR
        System.out.println(!(x>y));         // NOT
    }
}