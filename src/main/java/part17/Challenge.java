package part17;
public class Challenge {
    // Adds all numbers except 13 and the number immediately after a 13
    public static int sumSkip13(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Do not add 13
            if (nums[i] == 13) {
                continue;
            }

            // Do not add a number if the number before it was 13
            if (i > 0 && nums[i - 1] == 13) {
                continue;
            }

            // Adds the current allowed number to the total
            sum = sum + nums[i];
        }

        return sum;
    }

    // Returns true if two numbers beside each other both equal value
    public static boolean hasPair(int[] nums, int value) {

        // Stops one position early because we also check i + 1
        for (int i = 0; i < nums.length - 1; i++) {

            // Checks whether the current number and the next number both match value
            if (nums[i] == value && nums[i + 1] == value) {
                return true;
            }
        }

        // No matching pair was found
        return false;
    }
}