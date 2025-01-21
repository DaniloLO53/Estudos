package domain.arrays.removeDuplicateFromSorted;

public class RemoveDuplicateFromSorted {
    public int remove(int[] arr) {
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
}
