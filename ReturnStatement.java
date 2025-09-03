
import java.util.Scanner;

public class ReturnStatement {

    public static void main(String[] args) {
        greet();
        int first = readnumber();
        int second = readnumber();
        int sum = first + second;
        System.out.println("Sum of Two Numbers is: " + sum);

    }
    public static int readnumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER: ");
        int number =  input.nextInt();
        return number; // It will return the value.

    }

    public static void greet() {
        System.out.println("\n WELCOME TO CALCULAOTR \n");
    }

}
