package de.tellran.lesson22.practice1.practice3;

import java.util.Random;

public class LotteryEngine {

    private int[] luckyNumbers = new int[Constant.COUNT_SET_SIZE];

    //dostup k method private
    public int[] getLuckyNumbers() {
        return luckyNumbers;
    }

    public void runLottery() {

        int range = 50; //interval
        int lucky; // generate of lucky numbers
        int luckyCount; //the guessed numbers

        luckyCount = 1;
        Random random = new Random();
        for (int i = 0; i < Constant.COUNT_SET_SIZE; i++) {
            lucky = random.nextInt(range);
            switch (luckyCount) {
                case 1:
                    luckyNumbers[0] = lucky;
                    luckyCount++;
                    break;
                case 2:
                    if (luckyNumbers[0] != lucky) {
                        luckyNumbers[1] = lucky;
                        luckyCount++;
                    }
                    break;
                case 3:
                    if (luckyNumbers[0] != lucky && luckyNumbers[1] != lucky) {
                        luckyNumbers[2] = lucky;
                        luckyCount++;
                    }
                    break;
                case 4:
                    if (luckyNumbers[0] != lucky && luckyNumbers[1] != lucky && luckyNumbers[2] != lucky) {
                        luckyNumbers[3] = lucky;
                        luckyCount++;
                    }
                    break;
                case 5:
                    if (luckyNumbers[0] != lucky && luckyNumbers[1] != lucky && luckyNumbers[2] != lucky && luckyNumbers[3] != lucky) {
                        luckyNumbers[4] = lucky;
                        luckyCount++;
                    }
            }

        }
    }
}
