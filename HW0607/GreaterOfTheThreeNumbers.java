package HomeWork.HW0607;

import java.util.Scanner;

public class GreaterOfTheThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1= scanner.nextInt();

        System.out.println("Enter the second number:");
        int  number2= scanner.nextInt();

        System.out.print("Enter the third day : ");
        int number3= scanner.nextInt();

        int max = Math.max(number1,Math.max(number2, number3));
        System.out.println("The larger number is " + max);

    }


}
