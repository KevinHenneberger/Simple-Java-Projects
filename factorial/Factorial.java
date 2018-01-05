public class Factorial {
    
    public static int factorial(int n) {

        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
        	int f = n;
            
            for (int i = n - 1; i >= 1; i--) {
                f *= i;
            }

            return f;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
