import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        int userInt = scnr.nextInt();

        System.out.println("Enter double:");
        double userDouble = scnr.nextDouble();

        System.out.println("Enter character:");
        char userChar = scnr.next().charAt(0);

        System.out.println("Enter string:");
        String userStr = scnr.next();

        System.out.print(userInt + " " + userDouble + " " + userChar + " " + userStr);
        System.out.println(userStr + " " + userChar + " " + userDouble + " " + userInt);

        double num = userDouble;
        int b = (int)num;
        System.out.println(userDouble + "cast to an integer is " + b);




        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}