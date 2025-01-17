package domain.arrays.findMissingNumber;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 3, 5, 2, 7};
        System.out.println(find1(arr1));
        System.out.println(find2(arr1));

    }
    public static int find1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i+1] - 1 != arr[i]) return arr[i+1] - 1;
        }
        return -1;
    }

    public static int find2(int[] arr) {
        int sumArr = 0;
        for (int n: arr) {
            sumArr += n;
        }

        int arrLastNumber = arr.length + 1;
        int integersSum = arrLastNumber*(arrLastNumber + 1) / 2;

        return integersSum - sumArr;
    }
}
