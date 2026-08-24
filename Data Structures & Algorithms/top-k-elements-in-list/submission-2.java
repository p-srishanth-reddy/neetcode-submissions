

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Fix array initialization syntax
        int[][] window1 = new int[nums.length][2];
        int uniqueCount = 0;

        // 2. Count frequencies of each number
        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            // Only look through unique elements added so far
            for (int j = 0; j < uniqueCount; j++) {
                if (window1[j][0] == nums[i]) {
                    window1[j][1] += 1; // Increment frequency (Column 1)
                    found = true;
                    break;
                }
            }
            // If the number is new, add it to the tracking matrix
            if (!found) {
                window1[uniqueCount][0] = nums[i]; // Store the value
                window1[uniqueCount][1] = 1;       // Initialize count to 1
                uniqueCount++;
            }
        }

        // 3. Sort descending based on the 2nd column (frequencies)
        // (row2[1], row1[1]) puts highest frequencies first
        Arrays.sort(window1, 0, uniqueCount, (row1, row2) -> Integer.compare(row2[1], row1[1]));

        // 4. Extract top K elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = window1[i][0];
        }
        
        return result;
    }
}

