package com.java;

public class Gambling {
    static int won = 0, lost = 0, wonCount = 0, lostCount = 0;
    static int[] luckyDay =new int[35];
    static int[] badDay =new int[35];

    public static void main(String[] args) {
        int i=0,j=0;
        GamblingDetails gambling = new GamblingDetails();
        System.out.println("Gambling stake and bet per game : " + gambling.toString());
        while ((won < 50) && (lost < 50)) {
            randomCheck();
        }
        if (won == 50)
            System.out.println("won 50$ so you can resign from the game");
        else if ((lost == 50))
            System.out.println("lost 50$ you can resign from the game");
        for (i = 1; i <= 30; i++) {
            String result = checkResultCount();
            System.out.println("Day " + i + " = " + result);
            if(result=="Won LUCKY DAY!!!")
                luckyDay[i]=i;
            else if(result!="Won LUCKY DAY!!!")
                badDay[i]=i;
        }
        System.out.println("lucky days are : " );
        printingArray(luckyDay);
        System.out.println("Bad days are : " );
        printingArray(badDay);
        printing(30);// need to find count for 30 days
    }



    private static void printing(int i) {
        System.out.println("total no of times the gambler won the game in "+i+" days = " + wonCount);
        System.out.println("total no of times the gambler lost the game in "+i+" days = " + lostCount);
    }
    private static void printingArray(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[j] = i;
                System.out.println(array[j]);
            }
        }
    }

    private static String checkResultCount() {
        int randomCheck = (int) (Math.floor(Math.random() * 10) % 2);
        switch (randomCheck) {
            case 1:
                wonCount++;
                return "Won LUCKY DAY!!!";
            case 0:
                lostCount++;
                return "Lost BAD DAY!!!";
            default:
                break;
        }

        return null;
    }

    private static void randomCheck() {
        int randomCheck = (int) (Math.floor(Math.random() * 10) % 2);
        switch (randomCheck) {
            case 1:
                won++;
                break;
            case 0:
                lost++;
                break;
            default:
                break;
        }

    }
}

