import java.util.Scanner;

public class AddToNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int add = num1 + num2;
        System.out.println(add);
    }
}
