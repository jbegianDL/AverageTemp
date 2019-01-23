package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Temperature [] dailyAverageTemp = new Temperature[7];
        Temperature temp = new Temperature();
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < dailyAverageTemp.length; i++){
            dailyAverageTemp[i] = new Temperature();
            System.out.println("Please enter an average temperature in Fahrenheit: ");
            dailyAverageTemp[i].setTemp(input.nextDouble());
        }

        for (int i = 0; i < dailyAverageTemp.length; i++){
            System.out.println(dailyAverageTemp[i].getTempF());
        }

        for (int i = 0; i < dailyAverageTemp.length; i++){
            sum += dailyAverageTemp[i].getTempF();
            avg = sum / dailyAverageTemp.length;
        }

        System.out.println("The average Fahrenheit temperature is: " + avg);


        for (int i = 0; i < dailyAverageTemp.length; i++){
            System.out.println(dailyAverageTemp[i].convertToCelsius());
        }



    }
}
