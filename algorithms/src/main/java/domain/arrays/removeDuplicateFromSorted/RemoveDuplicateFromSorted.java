package domain.arrays.removeDuplicateFromSorted;

import application.PrintArray;

public class RemoveDuplicateFromSorted {
    public static int remove(int[] arr) {
        int i = 0, j = 0;

        while(i < arr.length) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
            i++;
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,3,4};
        System.out.println(remove(arr));
        PrintArray.print(arr);
    }
}

