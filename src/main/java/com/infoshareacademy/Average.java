package com.infoshareacademy;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Average {

  public static void main(String[] args) throws IOException {

    readFile();

  }

  static void readFile() throws IOException {

    Map<String, Double> averageMap = new HashMap<>();

    try (Scanner scanner = new Scanner(new File("average.csv"))) {

      while (scanner.hasNextLine()) {

        String[] data = scanner.nextLine().split(",");

        if (averageMap.containsKey(data[0])) {

          averageMap.merge(data[0], Double.parseDouble(data[1]), (aDouble, aDouble2) -> ((aDouble + aDouble2) / 2));

        } else {

          averageMap.put(data[0], Double.valueOf(data[1]));

        }

      }

    }

    System.out.println(averageMap.toString());

  }

}
