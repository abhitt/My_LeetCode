class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;  // Counter to keep track of how many flowers we can plant

        // Loop through each plot in the flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty
            if (flowerbed[i] == 0) {
                // Check if the previous plot is empty or it is the first plot
                boolean emptyPrev = (i == 0) || (flowerbed[i - 1] == 0);
                // Check if the next plot is empty or it is the last plot
                boolean emptyNext = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // If both previous and next plots are empty, we can plant a flower here
                if (emptyPrev && emptyNext) {
                    flowerbed[i] = 1;  // Plant the flower
                    count++;  // Increment the counter

                    // If we've planted enough flowers, return true
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }

        // If we finish the loop and haven't planted enough flowers, return false
        return count >= n;
    }
}
