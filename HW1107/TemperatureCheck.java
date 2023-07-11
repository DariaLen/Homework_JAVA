package HomeWork.HW1107;

import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        int temperature1, temperature2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature  of the first device: ");
        temperature1  = scanner.nextInt();

        System.out.print("Enter the temperature  of the second device: ");
        temperature2 = scanner.nextInt();

        checkTemp(temperature1,temperature2);
    }

    static void checkTemp(int temperature1, int temperature2){
        if(temperature1 > 100 && temperature2 < 100){
            System.out.println("Your device is working correctly!The temperature is normal. ");
        } else if(temperature1 < 100 && temperature2 < 100){
            System.out.println("Check the temperature of the first bulb! ");
        }else if(temperature1 > 100 && temperature2 > 100){
            System.out.println("Check the temperature of the second bulb! ");
        } else{
            System.out.println("Check the temperature in both flasks!The device does not work correctly.");
        }
    }



}
