package arrays;

public class ReverseArr {
//    public static void reverse(int[] arr) {
//        int[] reversedArr = getReversedArr(arr);
//
//        for(int i = 0; i < reversedArr.length; i++) {
//            arr[i] = reversedArr[i];
//        }
//    }
//
//    private static int[] getReversedArr(int[] arr) {
//        int[] reversedArr = new int[arr.length];
//        for (int i = arr.length - 1; i >= 0; i--) {
//            reversedArr[arr.length - i - 1] = arr[i];
//        }
//
//        return reversedArr;
//    }

    public static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
