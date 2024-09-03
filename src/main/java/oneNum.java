import java.util.Scanner;

public class oneNum {

    // check if it is quaternary integer
    public static boolean isQuaternaryInteger(String input) {
        return input.matches("[0-3]+");
    }

    // convert quaternary string to decimal integer
    public static int quaternaryToDecimal(String quaternary) {
        return Integer.parseInt(quaternary, 4);
    }

    // convert decimal integer to quaternary string
    public static String decimalToQuaternary(int decimal) {
        return Integer.toString(decimal, 4); //
    }

    // calculate the quaternary square root
    public static String quaternarySquareRoot(String quaternaryInput) {
        if (!isQuaternaryInteger(quaternaryInput)) {
            throw new IllegalArgumentException("Input is not a valid quaternary integer.");
        }
        // Convert the quaternary input to decimal
        int decimalValue = quaternaryToDecimal(quaternaryInput);
        // Calculate the square root of the decimal value
        int decimalSquareRoot = (int) Math.sqrt(decimalValue);
        // Convert the square root back to quaternary
        return decimalToQuaternary(decimalSquareRoot);
    }

    public static String quaternarySquare(String quaternaryInput) {
        if (!isQuaternaryInteger(quaternaryInput)) {
            throw new IllegalArgumentException("Input is not a valid quaternary integer.");
        }
        // Convert the quaternary input to decimal
        int decimalValue = quaternaryToDecimal(quaternaryInput);
        // Calculate the square of the decimal value
        int decimalSquare = decimalValue*decimalValue;
        // Convert the square root back to quaternary
        return decimalToQuaternary(decimalSquare);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("do you want to find?:\n1.)square\n2.)square root");
        String userChoice = scanner.nextLine();

        if (userChoice.equals("1")){
            System.out.print("Enter a quaternary integer: ");
            String quaternaryInput = scanner.nextLine();

            try {
                String result = quaternarySquare(quaternaryInput);
                System.out.println("Quaternary square: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } if (userChoice.equals("2")){
            System.out.print("Enter a quaternary integer: ");
            String quaternaryInput = scanner.nextLine();

            try {
                String result = quaternarySquareRoot(quaternaryInput);
                System.out.println("Quaternary square root: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("invalid selection");
        }

        scanner.close();
    }
}