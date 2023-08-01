package homework_01_08;

import java.util.Arrays;

public class ArrayFindElem {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int missingElement = sortArray(arr, arr.length+1);
        System.out.println("Пропущенный элемент: " + missingElement);
    }
    public static int sortArray(int[] sortArr, int n){
        Arrays.sort(sortArr);
//        System.out.println(Arrays.toString(sortArr));
        int sum = (n*(n+1))/2;

        for(int i = 0; i< sortArr.length; i++){
            sum -= sortArr[i];
        }
        return sum;
     }
}
