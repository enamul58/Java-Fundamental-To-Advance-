import java.util.Scanner;
public class StringInput {
    public static void main(String[] args){
        Scanner strInput = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = strInput.nextLine();
        System.out.println(name);
    }
}
