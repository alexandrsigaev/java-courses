import java.util.Scanner;

/**
 * Created by sanya on 05.04.2017.
 */
public class InteractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try {
            Calculate calculate = new Calculate();
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.print("Enter first arg: ");
                String first = reader.next();
                System.out.print("Enter second arg: ");
                String second = reader.next();
                System.out.print("Enter operation: ");
                String operation = reader.next();
                System.out.print("Result = ");
                calculate.getResult(first, second, operation);
            }
        }finally {
            reader.close();
        }
    }
}
