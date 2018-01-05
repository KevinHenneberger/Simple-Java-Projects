import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int t) {

        Arrays.sort(arr);
        
        int l = 0;
        int r = arr.length - 1;
    
        while (l <= r) {

            int m = ((r + l) / 2);

            if (arr[m] == t) {
                return m;
            } else if (arr[m] < t) {
                l = m + 1;
            } else if (arr[m] > t) {
                r = m - 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {5, 9, 7, 1, 3, 2, 9, 8, 2, 9};
        int t = 5;
        
        System.out.println(binarySearch(arr, t));
    }
}
