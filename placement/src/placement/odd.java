package placement;

public class odd {
    public static void main(String[] args) {
        // Example array of 10 numbers
        int[] numbers = {5, 12, 8, 3, 17, 9, 6, 22, 10, 4};
        int sumOfOdds = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                sumOfOdds += num; 
            }
        }
        System.out.println("The total sum of all odd numbers in the array is: " + sumOfOdds);
    }
}
