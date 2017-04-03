public class Calculate {
    public static void main(String[] args) {

        double first = Double.valueOf(args[0]);
        double second = Double.valueOf(args[1]);

        sum(first, second);
        subtract(first, second);
        multi(first, second);
        division(first, second);

    }

    public static void sum (int a, int b){
        System.out.print(a + " + " + b + " = ");
        System.out.println(a + b);
    }

    public static void sum (char a, char b){
        System.out.print(a + " + " + b + " = ");
        System.out.println(a + b);
    }

    public static void sum (double a, double b){
        System.out.print(a + " + " + b + " = ");
        System.out.println(a + b);
    }

    public static void sum (long a, long b){
        System.out.print(a + " + " + b + " = ");
        System.out.println(a + b);
    }

    public static void subtract (int a, int b){
        System.out.print(a + " - " + b + " = ");
        System.out.println(a - b);
    }

    public static void subtract (char a, char b){
        System.out.print(a + " - " + b + " = ");
        System.out.println(a - b);
    }

    public static void subtract (double a, double b){
        System.out.print(a + " - " + b + " = ");
        System.out.println(a - b);
    }

    public static void subtract (long a, long b){
        System.out.print(a + " - " + b + " = ");
        System.out.println(a - b);
    }

    public static void multi (int a, int b){
        System.out.print(a + " * " + b + " = ");
        System.out.println(a * b);
    }

    public static void multi (char a, char b){
        System.out.print(a + " * " + b + " = ");
        System.out.println(a * b);
    }

    public static void multi (double a, double b){
        System.out.print(a + " * " + b + " = ");
        System.out.println(a * b);
    }

    public static void multi (long a, long b){
        System.out.print(a + " * " + b + " = ");
        System.out.println(a * b);
    }

    public static void division (int a, int b){
        System.out.print(a + " / " + b + " = ");
        System.out.println(a / b);
    }

    public static void division (char a, char b){
        System.out.print(a + " / " + b + " = ");
        System.out.println(a / b);
    }

    public static void division (double a, double b){
        System.out.print(a + " / " + b + " = ");
        System.out.println(a / b);
    }

    public static void division (long a, long b){
        System.out.print(a + " / " + b + " = ");
        System.out.println(a / b);
    }
}
