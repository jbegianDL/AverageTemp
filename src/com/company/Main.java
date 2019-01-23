package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Temperature [] dailyAverageTemp = new Temperature[7];

        for (int i = 0; i < dailyAverageTemp.length; i++){
            dailyAverageTemp[i] = new Temperature();
            System.out.println("Please enter an average temperature in Fahrenheit: ");
            dailyAverageTemp[i].setTemp(input.nextDouble());
        }



    }
}
