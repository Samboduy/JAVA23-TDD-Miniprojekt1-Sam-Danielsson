import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberCalcTest {

    @Test
    @DisplayName("Primenumbers from 2 to 10")
    public void testPrimeNumberTwoToTen() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
        int AmountOfPrimeNumbers = calc.calculatePrimeNumbers(10);
        assertEquals(AmountOfPrimeNumbers,4);
    }
    @Test
    @DisplayName("Primenumbers from 2 to 20")
    public void testPrimeNumberTwoToTwenty() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
        int AmountOfPrimeNumbers = calc.calculatePrimeNumbers(20);
        assertEquals(AmountOfPrimeNumbers,8);
    }
    @Test
    @DisplayName("Primenumbers from 2 to 100")
    public void testPrimeNumberTwoToHundred() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
        int AmountOfPrimeNumbers = calc.calculatePrimeNumbers(100);
        assertEquals(AmountOfPrimeNumbers,25);
    }
    @Test
    @DisplayName("Chekc if a number is a primenumber")
    public void testCheckPrimeNumber() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
        boolean isPrime = calc.isPrimeNumber(5);
        assertEquals(isPrime,true);
    }
    @Test
    @DisplayName("Chekc if a number is a primenumber")
    public void testCheckNegativeNumber() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
        boolean isPrime = calc.isPrimeNumber(-5);
        assertEquals(isPrime,false);
    }
    @Test
    @DisplayName("Testing range input must be between 0 and 1000")
    public void testRangeInputCantBeOver1000() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
        assertThrows(ArithmeticException.class,()->{
            int AmountOfPrimeNumbers = calc.calculatePrimeNumbers(1001);
        });
    }
    @Test
    @DisplayName("primenumbers 0 to 1000")
    public void testPrimenumbers0To1000() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
        int AmountOfPrimeNumbers = calc.calculatePrimeNumbers(1000);
        assertEquals(AmountOfPrimeNumbers,168);
    }
    @Test
    @DisplayName("Sum of primenumbers from zero to 100")
    public void testSumOfPrimeNumbers() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
        int AmountOfPrimeNumbers = calc.calculatePrimeNumbers(0);
    }
    @Test
    @DisplayName("Testing specifying range")
    public void testSpecifyRange() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
       int result =  calc.specifyRange("10");
        assertEquals(10,result);
    }
    @Test
    @DisplayName("Testing specifying range with letters")
    public void testSpecifyRangeWithLetters() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
        int result =  calc.specifyRange("a");
        assertEquals(0,result);
    }
    @Test
    @DisplayName("Testing specifying range with symbols")
    public void testSpecifyRangeWithSymbols() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
        int result =  calc.specifyRange("+");
        assertEquals(0,result);
    }
    @Test
    @DisplayName("check if input is a number")
    public void testCheckIfInputIsANumber() {
        PrimeNumberCalc calc = new PrimeNumberCalc();
        boolean isPrime = calc.checkIfNumber("1");
        assertEquals(isPrime,true);
    }




}