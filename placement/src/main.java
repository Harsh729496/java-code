public class main {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 3, 17, 9, 6, 22, 10, 4};
        int target = 15;
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break; // Exit the loop early if found
            }
        }
        if (found) {
            System.out.println(target + " was found in the array.");
        } else {
            System.out.println(target + " was not found in the array.");
        }
    }
}
