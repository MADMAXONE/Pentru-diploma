package org.example;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;
            boolean isRizz = i % 7 == 0;
            boolean isJazz = i % 11 == 0;

            if (isFizz && isBuzz && isRizz && isJazz) {
                System.out.println("FizzBuzzRizzJazz");
            } else if (isFizz && isBuzz && isRizz) {
                System.out.println("FizzBuzzRizz");
            } else if (isFizz && isBuzz && isJazz) {
                System.out.println("FizzBuzzJazz");
            } else if (isFizz && isRizz && isJazz) {
                System.out.println("FizzRizzJazz");
            } else if (isBuzz && isRizz && isJazz) {
                System.out.println("BuzzRizzJazz");
            } else if (isFizz && isBuzz) {
                System.out.println("FizzBuzz");
            } else if (isFizz && isRizz) {
                System.out.println("FizzRizz");
            } else if (isFizz && isJazz) {
                System.out.println("FizzJazz");
            } else if (isBuzz && isRizz) {
                System.out.println("BuzzRizz");
            } else if (isBuzz && isJazz) {
                System.out.println("BuzzJazz");
            } else if (isRizz && isJazz) {
                System.out.println("RizzJazz");
            } else if (isFizz) {
                System.out.println("Fizz");
            } else if (isBuzz) {
                System.out.println("Buzz");
            } else if (isRizz) {
                System.out.println("Rizz");
            } else if (isJazz) {
                System.out.println("Jazz");
            } else {
                System.out.println(i);
            }
        }
    }
}
