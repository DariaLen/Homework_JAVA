package HomeWork.HW0607;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the year  : ");
        isLeap(scanner.nextInt());
    }

    static void isLeap(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " year  is  leap!");
        }
        else {
            System.out.println(year + " year is not leap!");
        }
    }
}
