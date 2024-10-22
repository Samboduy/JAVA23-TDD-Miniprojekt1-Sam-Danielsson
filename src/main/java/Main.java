import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean programIsRunning = true;
        PrimeNumberCalc calc = new PrimeNumberCalc();
        Scanner scanner = new Scanner(System.in);
        while (programIsRunning) {
            System.out.printf("1.Calculate Prime Numbers within a range\n0.Quit");
            String choice = scanner.nextLine();
            switch (choice) {
                case "0":
                    programIsRunning = false;
                    break;
                    case "1":
                        System.out.println("choose a range");
                        String range = scanner.nextLine();
                        calc.calculatePrimeNumbers(calc.specifyRange(range));
                        break;


            }
        }
    }
}
