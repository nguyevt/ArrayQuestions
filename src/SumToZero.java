import java.util.Arrays;

public class SumToZero {

    private SumToZero() {

    }

    public static void sumToZero(int[] inputArray) {
        Arrays.sort(inputArray);
        for (int i = 0; i < inputArray.length - 2; i++) {
        	for (int j = i + 1; j < inputArray.length - 1; j++) {
        		for (int k = j + 1; k < inputArray.length; k++) {
        			if (inputArray[i] + inputArray[j] + inputArray[k] == 0) {
        				System.out.println(inputArray[i] + " " + inputArray[j] + " " + inputArray[k]);
        			}
        		}
        	}
        }
    }
    
    public static void main(String[] args) {
        sumToZero(new int[]{2, 3, 1, -2, -1, 0, 2, -3, 0});
    }    
}
