public class ArgRunner {

    public static void main(String[] args) {

        if (args.length == 3){
            Calculate calc = new Calculate();
            calc.doCalculate(Double.valueOf(args[0]), Double.valueOf(args[1]), args[3]);
        }else{
            System.out.println("Follow the on-screen instructions");
            InteractRunner runner = new InteractRunner();
            runner.interactRun();
        }
    }
}
