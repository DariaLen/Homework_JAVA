package HomeWork.HW1107;

import java.util.Scanner;

public class CalcBankDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текущую сумму на счету: ");
        int sum = scanner.nextInt();
        int days = calcDays(sum);

        System.out.println("Вам потребуется " + days + " дней, чтобы забрать все деньги из банка.");

    }

    static int calcDays(int sum){
        int days = 0;

    while(sum > 1) {
        int max = 0;

        for(int i =1; i < sum; i++){
            if(sum % i == 0 && i < sum){
                if(max < i){
                    max=i;
                }
            }
        }
        sum-=max;
        days++;

    }

        return days;
    }

}
