import java.util.Arrays;

public class MeanMedianMode {
    
    public static double mean(int[] data) {
        
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        
        return sum / data.length;
    }
    
    public static double median(int[] data) {
        
        Arrays.sort(data);
       
        int middleIndex = data.length / 2;
        
        if (data.length % 2 == 1) {
            return data[middleIndex];
        } else {
            return (double)(data[middleIndex - 1] + data[middleIndex]) / 2;
        }
    }
    
    public static int mode(int[] data) {
        
        int mode = 0;
        int maxFrequency = 0;

        for (int i = 0; i < data.length; i++) {
            
            int currentFrequency = 0;
            
            for (int j = 0; j < data.length; j++) {
                
                if (data[i] == data[j]) {
                    currentFrequency++;
                }
                
                if (currentFrequency > maxFrequency) {
                    maxFrequency = currentFrequency;
                    mode = data[j];
                }
            }
        }
        
        return mode;
    }

    public static void main(String[] args) {
        
        int[] data = {5, 9, 7, 1, 3, 2, 9, 8, 2, 9};
        
        System.out.println("Mean: " + mean(data));
        System.out.println("Median: " + median(data));
        System.out.println("Mode: " + mode(data));
    }   
}
