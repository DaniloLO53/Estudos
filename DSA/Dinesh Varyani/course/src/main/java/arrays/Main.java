package arrays;

public class Main {
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d]: %d\n", i, arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 3, 5, 0, 6, 7, 1, 8, 10, 0};

        MoveZerosToEnd.move1(arr1);
        MoveZerosToEnd.move2(arr1);
        printArr(arr1);
//        System.out.println(FindMinimumValue.find(arr1));
//        ReverseArr.reverse(arr1, 1, 3);
//        printArr(arr1);
//        printArr(RemoveEven.remove(arr1));
//        printArr(arr1);
    }
}
