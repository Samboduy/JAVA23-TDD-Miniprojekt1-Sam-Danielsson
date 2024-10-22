import java.util.Scanner;

public class PrimeNumberCalc {

    private int sum;

    public int calculatePrimeNumbers(int range){
        int amountOfPrimeNumbers = 0;
        sum = 0;
        if (range < 0 || range >1000){
            throw new ArithmeticException("Range must be between 0 and 1000");
        }
        for (int i = 2; i<range; i++){
            if (isPrimeNumber(i)){
                amountOfPrimeNumbers++;
                calculateSumOfPrimeNumbers(i);
            }
        }
        showResult(sum,amountOfPrimeNumbers,range);
        return amountOfPrimeNumbers;
    }
    public void calculateSumOfPrimeNumbers(int primeNumber){
        sum += primeNumber;
    }
    public boolean isPrimeNumber(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <number; i++){
            if (number % i == 0){
                return false;
            }
        }
        //**/System.out.println(number);
        return true;
    }

    public int specifyRange(String range){
        if(checkIfNumber(range)){
            return Integer.parseInt(range);
        }
        else {
            return 0;
        }
    }
    public boolean checkIfNumber(String number){
        if (number == null){
            return false;
        }
        try {
            Integer.parseInt(number);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
    public void showResult(int sum, int amountOfPrimeNumbers, int range){
        System.out.println("Hej, det finns " + amountOfPrimeNumbers + " primtal mellan 0 och "
                + range);
        System.out.println("Och den totala summan av dessa primtal är " + sum);
    }



}
