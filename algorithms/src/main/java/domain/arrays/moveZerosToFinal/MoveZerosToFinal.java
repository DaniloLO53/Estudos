package domain.arrays.moveZerosToFinal;

import application.PrintArray;

public class MoveZerosToFinal {
    public static void move(int[] arr) {
        //  i
        // [0, 1, 2, 0, 3, 0, 4]
        //  j

        int j = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[j] == 0 && arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

            if(arr[i] == 0 && arr[j] != 0) {
                j = i;
            }

            i++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {0,0,0};
        move(numbers);
        PrintArray.print(numbers);
    }
}
