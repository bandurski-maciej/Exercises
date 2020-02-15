package com.infoshareacademy;

import java.util.Scanner;

public class CesarCypher {

  public static void main(String[] args) {

    choosingWorkMode();

  }

  static void choosingWorkMode() {

    System.out.println("Please choose work mode (1 ENCRYPTION, 2 DECRYPTION): ");

    Scanner scanner = new Scanner(System.in);
    int workMode = scanner.nextInt();

    if (workMode == 1) {
      encryption();
    } else {
      decryption();
    }

  }

  private static StringBuilder encryption() {

    System.out.println("Please enter text to encrypt: ");
    Scanner scanner = new Scanner(System.in);
    String textToEncrypt = scanner.nextLine();
    StringBuilder encryptedText = new StringBuilder();

    for (int i = 0; i < textToEncrypt.length(); i++) {

      char c;

      if (Character.isAlphabetic(textToEncrypt.charAt(i))) {

        if (textToEncrypt.charAt(i) > 87 && Character.isUpperCase(textToEncrypt.charAt(i))) {

          c = (char) (textToEncrypt.charAt(i) - 23);

        } else if (textToEncrypt.charAt(i) > 119 && Character.isLowerCase(textToEncrypt.charAt(i))) {

          c = (char) (textToEncrypt.charAt(i) - 23);

        } else {
          c = (char) (textToEncrypt.charAt(i) + 3);

        }

        encryptedText.append(c);

      } else {

        encryptedText.append(textToEncrypt.charAt(i));

      }

    }

    System.out.println("Encrypted text: " + encryptedText);

    return encryptedText;

  }

  private static StringBuilder decryption() {

    System.out.println("Please enter text to decrypt: ");
    Scanner scanner = new Scanner(System.in);
    String textToDecrypt = scanner.nextLine();
    StringBuilder decryptedText = new StringBuilder();

    for (int i = 0; i < textToDecrypt.length(); i++) {

      char c;

      if (Character.isAlphabetic(textToDecrypt.charAt(i))) {

        if (textToDecrypt.charAt(i) < 68 && Character.isUpperCase(textToDecrypt.charAt(i))) {

          c = (char) (textToDecrypt.charAt(i) + 23);

        } else if (textToDecrypt.charAt(i) < 100 && Character.isLowerCase(textToDecrypt.charAt(i))) {

          c = (char) (textToDecrypt.charAt(i) + 23);

        } else {
          c = (char) (textToDecrypt.charAt(i) - 3);

        }

        decryptedText.append(c);

      } else {

        decryptedText.append(textToDecrypt.charAt(i));

      }

    }

    System.out.println("Decrypted text: " + decryptedText);

    return decryptedText;

  }

}

