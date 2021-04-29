package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature farenheit");
        double fahrenheitTemp = scanner.nextDouble();
        double celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;

        System.out.println(fahrenheitTemp + "Temperature equal :: " + celsiusTemp);

        float floatNum = (float) celsiusTemp;
        System.out.println("double " + celsiusTemp + " cast to float value is ::" + floatNum);

        int intNum = (int) celsiusTemp;
        System.out.println("double " + celsiusTemp + " cast to int value is ::" + intNum);


    }

}
