package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf(String.valueOf(isEven(7)));

    }
    public static boolean isEven(int number) {
        return number%2==0;
    }

    public static String playFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Fizzbuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "BuzzZZZ";
        } else {
            return String.valueOf(number);
        }
    }
}