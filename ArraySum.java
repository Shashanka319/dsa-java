public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int oddSum = 0;
        int evenSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num; 
            } else {
                oddSum += num;  
            }
        }

        System.out.println("oddSum = " + oddSum + ", evenSum = " + evenSum);
    }
}