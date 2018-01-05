public class EvenOrOdd {
    
    public static boolean evenOrOdd(int n) {
        
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(12));
    }
}
