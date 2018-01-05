import java.util.Arrays;

public class ArraySlice {
    
    public static String slice(String[] arr, int a, int b) {
        
        if (a >= b || a < 0 || b < 0 || b > arr.length) {
            return "Invalid Input.";
        }
        
        String[] slicedArr;
        
        slicedArr = new String[b - a];
        
        for (int i = a; i < b; i++) {
            slicedArr[i - a] = arr[i];
        }
        
        return Arrays.toString(slicedArr);
    }

    public static void main(String[] args) {
        
        String[] arr = {"Banana", "Orange", "Lemon", "Apple", "Mango", "Watermelon"};
        
        System.out.println(slice(arr, 2, 5));
    }
}
