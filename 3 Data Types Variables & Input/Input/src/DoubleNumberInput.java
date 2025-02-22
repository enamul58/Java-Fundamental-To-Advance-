import java.util.Scanner;

public class DoubleNumberInput {
    public static void main(String[] args){
        Scanner DoubleNumber = new Scanner(System.in);
        System.out.println("Please enter double numeric value");
        double DoubleNumberNum1 = DoubleNumber.nextDouble();
        System.out.println("please enter double numeric value");
        double DoubleNumberNum2 = DoubleNumber.nextDouble();
        double result = DoubleNumberNum1 + DoubleNumberNum2;
        System.out.println("addition result of fraction number:" + result);
    }
}
