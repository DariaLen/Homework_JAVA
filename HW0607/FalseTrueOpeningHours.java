package HomeWork.HW0607;

import java.util.Scanner;

public class FalseTrueOpeningHours {
    public static void main(String[] args) {

        int edekaStart = 8;
        int edekaEnd = 20;
        int reweStart = 9;
        int reweEnd = 22;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the current time : ");
    int hour = scanner.nextInt();

    System.out.println( canBuy(edekaStart, edekaEnd, reweStart, reweEnd, hour));
}

    public static String canBuy(int start1 , int end1, int start2 , int end2,int hour) {

        String openShops = "";
        if ((hour >= start1 && hour < end1 ) &&( hour >= start2 && hour<end2)) {
          openShops = "You can shop in Rewe and Edeka";
        } else if (hour >= start1 && hour < end1 ){
            openShops = "You can shop in Edeka";
        } else if ( hour >= start2 && hour<end2) {
       openShops= "You can shop in Rewe";
        } else{
            openShops= "Shops are closed!";
        }
return openShops;
    }
}


