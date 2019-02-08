 
import java.util.Scanner;

public class ShortCalculator {
    public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Pick a number from 0 to 65535");
    short firstNumber = scan.nextShort();
    System.out.println("Pick another number from 0 to 65535");
    short secondNumber = scan.nextShort();
    System.out.println("The sum is " + add (firstNumber,secondNumber));
    System.out.println("The difference is " + difference (firstNumber,secondNumber));
    System.out.println("The product is " + product (firstNumber,secondNumber));
    System.out.println("The quotient is " + quotient (firstNumber,secondNumber));
    System.out.println("The remainder is " + remainder (firstNumber,secondNumber));
}
public static short add(short firstNumber,short secondNumber){
    return (short)(firstNumber + secondNumber);
}
public static short difference(short firstNumber, short secondNumber){
    return (short)(firstNumber - secondNumber);
}
public static short product(short firstNumber, short secondNumber){
    return (short)(firstNumber * secondNumber);
}
public static short quotient(short firstNumber, short secondNumber){
    return (short)(firstNumber / secondNumber);
}
public static short remainder(short firstNumber, short secondNumber){
    return (short)(firstNumber % secondNumber);
}
}
