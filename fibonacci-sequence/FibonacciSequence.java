import java.util.Arrays;

public class FibonacciSequence {
    
    public static String fibonacciSequence(int t) {

        int[] sequence;
        sequence = new int[t];
        
        int a = 0;
        int b = 0;
        int c = 1;
        
        int i = 0;
        
        while (i < t) {
            
            sequence[i] = c;
            
            a = b;
            b = c;
            c = a + b;
            
            i++;
        }

        return Arrays.toString(sequence);
    }

    public static void main(String[] args) {
        System.out.println(fibonacciSequence(10));
    }
}
