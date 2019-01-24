package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Temperature [] dailyAverageTemp = new Temperature[7];
        Temperature [] dailyAverageTempCelsius = new Temperature[7];
        String lineBreak = "\n";
        String prompt = "How would you like your information provided?" + lineBreak + "1 - Fahrenheit" + lineBreak + "2 - Celsius";
        double sumF = 0;
        double avgF = 0;
        double sumC = 0;
        double avgC = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < dailyAverageTemp.length; i++){
            dailyAverageTemp[i] = new Temperature();
            System.out.println("Please enter an average temperature in Fahrenheit: ");
            dailyAverageTemp[i].setTempF(input.nextDouble());
        }

        System.out.println(prompt);
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Average Weekly Fahrenheit Temperatures: ");
                for (int i = 0; i < dailyAverageTemp.length; i++){
                    System.out.println(dailyAverageTemp[i].getTempF());
                }

                for (int i = 0; i < dailyAverageTemp.length; i++){
                    sumF += dailyAverageTemp[i].getTempF();
                    avgF = sumF / dailyAverageTemp.length;
                }

                System.out.println("The average Fahrenheit temperature this week is: " + avgF);
                break;

            case 2:
                System.out.println("Average Weekly Celsius Temperatures: ");
                for (int i = 0; i < dailyAverageTemp.length; i++){
                    dailyAverageTempCelsius[i] = new Temperature();
                    dailyAverageTempCelsius[i].setTempC(dailyAverageTemp[i].convertToCelsius());
                    System.out.println(dailyAverageTempCelsius[i].getTempC());
                }

                for (int i = 0; i < dailyAverageTempCelsius.length; i++){
                    sumC += dailyAverageTempCelsius[i].getTempC();
                    avgC = sumC / dailyAverageTempCelsius.length;
                }

                System.out.println("The average Celsius temperature this week is: " + avgC);
                break;

            default:
                System.out.println("Error - Incorrect input");
                break;
        }










    }
}
