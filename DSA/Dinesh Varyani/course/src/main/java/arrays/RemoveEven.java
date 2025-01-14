package arrays;

public class OneDimensionalArray {
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d]: %d\n", i, arr[i]);
        }
    }

    public static int[] removeEven(int[] arr) {
        int newArrLength = 0;
        for (int n: arr) {
            if(n % 2 != 0) {
                newArrLength += 1;
            }
        }

        int[] newArr = new int[newArrLength];
        int newArrIndex = 0;
        for (int n: arr) {
            if(n % 2 != 0) {
                newArr[newArrIndex] = n;
                newArrIndex += 1;
            }
        }

        return newArr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6, 7, 8, 10};
        printArr(removeEven(arr1));
//        printArr(arr1);
    }
}