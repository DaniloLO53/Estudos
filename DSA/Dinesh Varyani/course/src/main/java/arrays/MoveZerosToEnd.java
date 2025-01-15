package arrays;

public class MoveZerosToEnd {
    public static void move1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for(int j = i + 1; j < arr.length; j++) {
                    arr[j-1] = arr[j];
                }
                arr[arr.length - 1] = 0;
            }
        }
    }

    public static void move2(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }
}
