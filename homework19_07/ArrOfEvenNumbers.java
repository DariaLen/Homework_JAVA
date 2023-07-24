package homework19_07;

import java.util.Random;

public class ArrOfEvenNumbers {
    public static void main(String[] args) {
        int[] arrInt = new int[8];

        System.out.println("All the number in the array: ");
        Random random = new Random();
        for(int i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(50);
            System.out.print( arrInt[i]+", ");
        }


        System.out.println("\nOdd numbers of the array = 0");
        for(int i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(50);

            if(arrInt[i] % 2 != 0) {
                arrInt[i] = 0;
            }
            System.out.println(arrInt[i]);
        }
    }
}
