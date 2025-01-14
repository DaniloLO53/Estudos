package arrays;

public class Main {
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d]: %d\n", i, arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6, 7, 8, 10};
        printArr(RemoveEven.remove(arr1));
//        printArr(arr1);
    }
}
