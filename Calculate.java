public class Calculate {

    private double result;

    public Calculate() {
        this.result = 0;
    }

    public double getResult() {
        return this.result;
    }

    public void cleanResult(){
        this.result = 0;
    }

    private double sum (double a, double b){
        return this.result = a + b;

    }

    private double subtract (double a, double b){
        return this.result = a - b;
    }

    private double multi (double a, double b){
        return this.result = a * b;
    }

    private double division (double a, double b){
        return this.result = a / b;
    }

    public void doCalculate (double firstArg, double secondArg, String operation){
        switch (operation){
            case "+" :
                System.out.println(sum(firstArg, secondArg));
                break;
            case "-" :
                System.out.println(subtract(firstArg, secondArg));
                break;
            case "*" :
                System.out.println(multi(firstArg, secondArg));
                break;
            case "/" :
                System.out.println(division(firstArg, secondArg));
        }


    }
}
