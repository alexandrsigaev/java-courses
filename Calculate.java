public class Calculate {


    public void getResult (String firstArg, String secondArg, String operation){
        double first = Double.valueOf(firstArg);
        double second = Double.valueOf(secondArg);
        switch (operation){
            case "+" :
                System.out.println(sum(first, second));
                break;
            case "-" :
                System.out.println(subtract(first, second));
                break;
            case "*" :
                System.out.println(multi(first, second));
                break;
            case "/" :
                System.out.println(division(first, second));
        }


    }


    private static int sum (int a, int b){
        return a + b;
    }

    private static char sum (char a, char b){
        return (char) (a + b);
    }

    private static double sum (double a, double b){
        return a + b;
    }

    private static long sum (long a, long b){
        return a + b;
    }

    private static int subtract (int a, int b){
        return a - b;
    }

    private static char subtract (char a, char b){
        return (char) (a - b);
    }

    private static double subtract (double a, double b){
        return a - b;
    }

    private static long subtract (long a, long b){
        return a - b;
    }

    private static int multi (int a, int b){
        return a * b;
    }

    private static char multi (char a, char b){
        return (char) (a * b);
    }

    private static double multi (double a, double b){
        return a * b;
    }

    private static long multi (long a, long b){
        return a * b;
    }

    private static int division (int a, int b){
        return a / b;
    }

    private static char division (char a, char b){
        return (char) (a / b);
    }

    private static double division (double a, double b){
        return a / b;
    }

    private static long division (long a, long b){
        return a / b;
    }
}
