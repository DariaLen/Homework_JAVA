package de.tellran.lesson22.practice1.practice3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StartLottery {
    public static void main(String[] args) {
        int[] userNumbers = Utils.getUserLotteryNumbers();
        System.out.println(Arrays.toString(userNumbers));

        //2 and 3 users
        int[] userNumbers2 = Utils.getUserLotteryNumbers();
        System.out.println(Arrays.toString(userNumbers2));
        int[] userNumbers3 = Utils.getUserLotteryNumbers();
        System.out.println(Arrays.toString(userNumbers3));

        LotteryEngine lottery = new LotteryEngine();
        lottery.runLottery();
        int[] winnerNumbers = lottery.getLuckyNumbers();
        System.out.println(Arrays.toString(winnerNumbers));

        System.out.println("Coincidences 1 user : "+ Utils.compareWinnerNumbers(winnerNumbers, userNumbers));
        // 2 and 3 users
        System.out.println("Coincidences 2 user : "+ Utils.compareWinnerNumbers(winnerNumbers, userNumbers2));
        System.out.println("Coincidences 3 user : "+ Utils.compareWinnerNumbers(winnerNumbers, userNumbers3));
    }
}
