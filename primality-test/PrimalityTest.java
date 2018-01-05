public class PrimalityTest {
    
    public static boolean primalityTest(int n) {
        
        if (n < 2) {
            return false;
        }
        
        if (n == 2) {
            return true;
        }
        
        if (n % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
            
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primalityTest(9));
    }
}
