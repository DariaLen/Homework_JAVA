package de.tellran.lesson22.practice1.practice3;

import java.util.Scanner;

public class Utils {
    public static int[] getUserLotteryNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[Constant.COUNT_SET_SIZE];
        for(int i = 0; i < Constant.COUNT_SET_SIZE; i++) {
            do {
                System.out.print("Enter the  " + (i+1) + " number = ");
                userNumbers[i] = scanner.nextInt();
            } while( userNumbers[i] <= 0 ||  userNumbers[i]> 50);

        }
        return userNumbers;
    }


    public static int compareWinnerNumbers(int[] lotteryNumbers, int[] userNumbers){
        int count = 0;
        for(int valUser : userNumbers) {
            for(int valLottery: lotteryNumbers) {
                if(valUser == valLottery){
                    count++;
                    break;
                }
            }

        }
        return count;
    }

}
