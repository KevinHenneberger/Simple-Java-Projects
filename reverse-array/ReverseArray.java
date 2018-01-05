import java.util.Arrays;

public class ReverseArray {
    
    public static String reverseArray(int[] arr) {
        
        int[] newArr;

        newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - i - 1];
        }
        
        return Arrays.toString(newArr);
    }

    public static void main(String[] args) {
 
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        
        System.out.println(reverseArray(arr));
    }
}
