package ru.vsu.cs;

public class Main {

    public static void main(String[] args) {
        int sum = calculateSumDigit(100, 999);
        printSumDigit(sum);
    }

    public static int calculateSumDigit(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            int digit1 = i % 10;
            int digit2 = (i / 10) % 10;
            int digit3 = i / 100;
            if (isEveryDigitUnique(digit1, digit2, digit3)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static boolean isEveryDigitUnique(int digit1, int digit2, int digit3) {
        return digit1 != digit2 && digit1 != digit3 && digit2 != digit3;
    }

    public static void printSumDigit(int sum) {
        System.out.println("The sum's result of digits, which fulfill the condition: " + sum);
    }
}
