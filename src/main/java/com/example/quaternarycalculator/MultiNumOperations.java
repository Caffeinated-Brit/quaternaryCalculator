package com.example.quaternarycalculator;

public class MultiNumOperations {

    private static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input is null or empty.");
        }
        try {
            Integer.parseInt(str, 4);
            return true;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input is not a valid quaternary integer.");
        }
    }

    private static int quaternaryToDecimal(String quaternary) {
        if (isInteger(quaternary)) {
            return Integer.parseInt(quaternary, 4);
        }
        return 0;
    }

    private static String decimalToQuaternary(int decimal) {
        return Integer.toString(decimal, 4);
    }

    public static String add(String num1, String num2) {
        int decimalResult = quaternaryToDecimal(num1) + quaternaryToDecimal(num2);
        return decimalToQuaternary(decimalResult);
    }

    public static String subtract(String num1, String num2) {
        int decimalResult = quaternaryToDecimal(num1) - quaternaryToDecimal(num2);
        return decimalToQuaternary(decimalResult);
    }

    public static String multiply(String num1, String num2) {
        int decimalResult = quaternaryToDecimal(num1) * quaternaryToDecimal(num2);
        return decimalToQuaternary(decimalResult);
    }

    public static String divide(String num1, String num2) {
        if (quaternaryToDecimal(num2) == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
        int decimalResult = quaternaryToDecimal(num1) / quaternaryToDecimal(num2);
        return decimalToQuaternary(decimalResult);
    }

    // Main method for testing only
    public static void main(String[] args) {
        System.out.println(add("1","13"));
        System.out.println(subtract("1","2"));
        System.out.println(multiply("1","2"));
        System.out.println(divide("1","2"));


    }
}
