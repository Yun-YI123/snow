package com.amy;

public class Snow {
    private static int SNOW_SIZE = 5;
    public static void main (String[] args)
    {
        Snowsnow[] snows = new Snowsnow[SNOW_SIZE];
        for (int a = 0; a < SNOW_SIZE; a++) {
            snows[a] = new Snowsnow();
            snows[a].start();
        }
        for (int s=0; s<50; s++) {
            for (int a = 0; a < SNOW_SIZE; a++) {
                for (int j = 0; j < snows[a].x; j++) {
                    System.out.print(" ");
                }
                System.out.print("雪");

                for (int j = 0; j < 20 - snows[a].x; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



