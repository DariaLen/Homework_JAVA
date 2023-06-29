package homeworkTask.HW_29_06;

public class CalcTask {
    public static void main(String[] args) {
        System.out.println(addNumbers(12,14));
        System.out.println(subNumbers(45,23));
        System.out.println(multiplication(2,4));
        System.out.println(divNumbers(25,5));

    }

    static int addNumbers(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    static int subNumbers(int num1, int num2){
        int sum = num1 - num2;
        return sum;
    }

    static int multiplication(int num1, int num2){
        int sum = num1 * num2;
        return sum;
    }

    static int divNumbers(int num1, int num2){
        int sum = num1 / num2;
        return sum;
    }
}
