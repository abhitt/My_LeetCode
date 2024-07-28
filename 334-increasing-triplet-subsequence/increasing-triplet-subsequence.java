class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // update first if num is smaller than or equal to first
            } else if (num <= second) {
                second = num; // update second if num is smaller than or equal to second
            } else {
                return true; // we have found a number greater than both first and second
            }
        }

        return false;
    }
}
