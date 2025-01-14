package arrays;

public class RemoveEven {
    public static int[] remove(int[] arr) {
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
}