package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Temperature [] dailyAverageTemp = new Temperature[7];
        Temperature [] dailyAverageTempCelsius = new Temperature[7];
        double sumF = 0;
        double avgF = 0;
        double sumC = 0;
        double avgC = 0;

        for (int i = 0; i < dailyAverageTemp.length; i++){
            dailyAverageTemp[i] = new Temperature();
            System.out.println("Please enter an average temperature in Fahrenheit: ");
            dailyAverageTemp[i].setTempF(input.nextDouble());
        }

        for (int i = 0; i < dailyAverageTemp.length; i++){
            System.out.println(dailyAverageTemp[i].getTempF());
        }

        for (int i = 0; i < dailyAverageTemp.length; i++){
            sumF += dailyAverageTemp[i].getTempF();
            avgF = sumF / dailyAverageTemp.length;
        }

        System.out.println("The average Fahrenheit temperature is: " + avgF);


        for (int i = 0; i < dailyAverageTemp.length; i++){
            dailyAverageTempCelsius[i] = new Temperature();
            dailyAverageTempCelsius[i].setTempC(dailyAverageTemp[i].convertToCelsius());
            System.out.println(dailyAverageTempCelsius[i].getTempC());
        }

        for (int i = 0; i < dailyAverageTempCelsius.length; i++){
            sumC += dailyAverageTempCelsius[i].getTempC();
            avgC = sumC / dailyAverageTempCelsius.length;
        }

        System.out.println(" The average Celsius temperature is: " + avgC);



    }
}
