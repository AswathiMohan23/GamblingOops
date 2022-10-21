package com.java;

public class Gambling {
    static int won = 0, lost = 0,wonCount=0,lostCount=0;
    public static void main(String[] args) {
        int i;
        GamblingDetails gambling = new GamblingDetails();
        System.out.println("Gambling stake and bet per game : " + gambling.toString());
        while ((won < 50) && (lost < 50)) {
            randomCheck();
        }
        if (won == 50)
            System.out.println("won 50$ so you can resign from the game");
        else if ((lost == 50))
            System.out.println("lost 50$ you can resign from the game");
        for (i = 1; i <= 20; i++) {
            String result = checkResultCount();
            System.out.println("Day " + i + " = " + result);
        }
        printing(20);
        //Each month would like to know the days won and lost and how much?
        //gave i<=10 because in previous line already checked 20 times and question is to check for 30 days
        // since already I have given count as "public static wonCount=0,lostCount=0",
        // already count after 20 days will be added so I am taking 10 here so that 10+20=30
        // and wonCount or lost count will have exact value

        for(i=1;i<=10;i++){
            String result = checkResultCount();
            System.out.println("Day " + i + " = " + result);
        }
        printing(30);// need to find count for 30 days


}
    private static void printing(int i) {
        System.out.println("total no of times the gambler won the game in "+i+" days = " + wonCount);
        System.out.println("total no of times the gambler lost the game in "+i+" days = " + lostCount);
    }

    private static String checkResultCount() {
        int randomCheck = (int) (Math.floor(Math.random() * 10) % 2);
        switch (randomCheck) {
            case 1:
                wonCount++;
                return "won";
            case 0:
                lostCount++;
                return "lost";
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

