package domain.arrays.isPalindrome;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "o";
        System.out.println(check(str));
    }

    public static boolean check(String str) {
        char[] lettersArr = str.toCharArray();

        int start = 0;
        int end = lettersArr.length - 1;

        while (start <= end) {
            if (lettersArr[start] != lettersArr[end]) return false;
            start++;
            end--;
        }

        return true;
    }
}

// {m,a,d,a,m}
//    i