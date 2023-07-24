package homework19_07;


import java.util.Arrays;
import java.util.Random;

public class IncreasingNumbers {
    public static void main(String[] args) {

        int[] arrNumber = FuncIncrNumbers(5, 90,100);
        System.out.println(Arrays.toString(arrNumber));

        boolean result = false;
        for (int i = 0; i < arrNumber.length; i++) {
            if ((arrNumber[i + 1] > arrNumber[i])) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println(" - Array " +Arrays.toString(arrNumber)  + " is ascending");
        } else {
            System.out.println(" - Array "  +Arrays.toString(arrNumber) + " is not ascending");
        }


    }

    private static int[]  FuncIncrNumbers(int size, int min, int max) {
        int[] arrInt = new int[size];
        Random random = new Random();
        for (int i = 0; i < arrInt.length; i++) {
//            arrInt[i] = (int)(Math.random()*max+min);
            arrInt[i] = random.nextInt((max - min +1)+min);
        }
       return arrInt;
    }
}

