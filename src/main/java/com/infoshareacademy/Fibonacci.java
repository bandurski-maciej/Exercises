package com.infoshareacademy;

import java.util.Scanner;

public class Fibonacci {

  static boolean CORRECT_INPUT;

  public static void main(String[] args) {

    getFibonacciElement();

  }

  static int getUserInput() {

    Scanner scanner = new Scanner(System.in);
    int userInputNumber = 0;

    do {

      System.out.println("Podaj numer elementu ciągu do wyliczenia: ");
      String userInput = scanner.next();

      if (userInput.matches("[0-9*]*")) {
        CORRECT_INPUT = true;
        userInputNumber = Integer.parseInt(userInput);

      } else {
        System.out.println("Proszę podać liczbę.");
        CORRECT_INPUT = false;
      }

    } while (!CORRECT_INPUT);

    return userInputNumber;
  }

  static void getFibonacciElement() {

    int userInputNumber = Fibonacci.getUserInput() - 1;
    int iterator = 0;
    int previousElement = 0;
    int currentElement = 1;
    int nextElement = 0;

    while (iterator < userInputNumber) {

      nextElement = previousElement + currentElement;
      previousElement = currentElement;
      currentElement = nextElement;

      iterator++;

    }

    System.out.println("Twój wyraz to: " + nextElement);

  }

}
