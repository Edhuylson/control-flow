import java.util.Scanner;

public class ControlFlow {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first parameter(an integer number): ");
        int first = getIntegerInput(scanner);
        System.out.println("Enter the second parameter(an integer number): ");
        int second = getIntegerInput(scanner);

        try {
            printNumbers(first, second);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        
    }

    static int getIntegerInput(Scanner scanner) {

        while(true) {
            try {
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid input. Please enter an integer: ");
            }
        }

    }

    static void printNumbers(int first, int second) throws InvalidParametersException {

        if(first <= second) {

            System.out.println("\nIncrementing by " + first + " to " + second + ":");

            for(int i = first; i <= second; i++) {
                System.out.println(i);
            }
        } else {
            throw new InvalidParametersException("The second parameter must be greater than the first.");
        }

    }

}
