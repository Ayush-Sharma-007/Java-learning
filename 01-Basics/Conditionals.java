public class Conditionals {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 8;

        if (a > b && a > c) {
            System.out.println("Greatest number is " + a);
        } else if (b > c) {
            System.out.println("Greatest number is " + b);
        } else {
            System.out.println("Greatest number is " + c);
        }

        // TERNARY OPERATOR

        int result = a % 2 == 0 ? 10 : 20;
        System.out.println(result);
    }
}
