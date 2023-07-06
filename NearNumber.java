package HomeWork;

import java.util.Random;

public class NearNumber {

    public static void main(String[] args) {

        //Домашнее задание №1  (работает только с положительными числами)
        System.out.println("The nearest positive numbers to 10 is : " + nearNumberReturn(16, 16.5));



        //Домашнее задание №2
//        Random random = new Random();
//        int randomNum = random.nextInt(28801);
//        if(randomNum < 3600) {
//            System.out.println("Until the end of the working day left : " + randomNum + " seconds!");
//            System.out.println("Until the end of the working day left : less than an hour!Hurray!");
//        } else {
//            int hours = (randomNum / 60) / 60;
//            System.out.println("Until the end of the working day left : " + randomNum + " seconds!");
//            System.out.println("Until the end of the working day left : " + hours + " hours!");
//        }

        //Домашнее задание №2
        Random random = new Random();
        int randomNum = random.nextInt(28801);
        if(randomNum < 3600) {
            System.out.println("Until the end of the working day left : " + randomNum + " seconds!");
            System.out.println("Until the end of the working day left : less than an hour!Hurray!");
        } else {
            int hours = (randomNum / 3600);
            int min = (randomNum / 60 ) % 60;
            int sec = randomNum % 60;
            System.out.println("Until the end of the working day left : " + randomNum + " seconds!");
            System.out.println("Until the end of the working day left : " + hours + " hours " + min + " minutes " + sec + " seconds.");
        }



    }


    //Домашнее задание №1
    static double nearNumberReturn(double m, double n) {
        if ((m - 10) > (n - 10)) {
            return n;
        } else {
            return m;
        }
    }


//    static double nearNumberReturn(double m, double n) {
//        double numberToCompare = 10;
//        if (Math.abs(m - numberToCompare) < Math.abs(n - numberToCompare)) {
//            return m;
//        } else {
//            return n;
//        }
//    }


//    static double nearNumberReturn(double m, double n) {
//        if ( (m > 0) && (n > 0) && ((m - 10) > (n - 10))) {
//            return n;
//        }  else if ((m - 10) < (n - 10)) {
//            return m;
//        }
//        else {
//            return m;
//        }
//    }



}
