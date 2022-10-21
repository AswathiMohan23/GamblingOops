package com.java;

public class Gambling {
    static int won = 0, lost = 0;
    public static void main(String[] args) {
        GamblingDetails gambling = new GamblingDetails();
        System.out.println("Gambling stake and bet per game : " + gambling.toString());
        while ((won < 50) && (lost < 50)) {
            randomCheck();
        }
        if (won == 50)
            System.out.println("won 50$ so you can resign from the game");
        else if ((lost == 50))
            System.out.println("lost 50$ you can resign from the game");
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

