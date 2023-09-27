import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String input = scanner.nextLine();
        if (input.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

    }
}
/*
NOTE: Strings cant be compared with an equals operator ==
For Strings, there exists a separate 'equals' command, which always append to the end of the string
that we want to compare.
 */