import java.util.Scanner;

public class InteractRunner {

    private Scanner reader;
    private double firstArg;
    private double secondArg;
    private String operation;

    public InteractRunner() {
        this.reader = new Scanner(System.in);
    }

    public void interactRun () {

        try {
            Calculate calculate = new Calculate();
            String exit = "no";
            while (!exit.equals("yes")){

                if (calculate.getResult() == 0.0){
                    System.out.print("Enter first arg: ");
                    this.firstArg = Double.valueOf(reader.next());
                }else {
                    this.firstArg = calculate.getResult();
                }
                
                System.out.print("Enter second arg: ");
                this.secondArg = Double.valueOf(reader.next());
                System.out.print("Enter operation: ");
                this.operation = reader.next();
                System.out.print("Result = ");
                calculate.doCalculate(firstArg, secondArg, operation);
                System.out.println("Do you want clean result? (yes/no)");
                if (reader.next().equals("yes")){
                    calculate.cleanResult();
                } else continue;
                System.out.println("Do you want exit? (yes/no)");
                exit = reader.next();
            }
        }finally {
            reader.close();
        }
    }
}
