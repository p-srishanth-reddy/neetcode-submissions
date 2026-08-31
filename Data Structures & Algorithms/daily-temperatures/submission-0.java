class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int x = temperatures.length;
        int result[] = new int[x];

        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                if (temperatures[j] > temperatures[i]) {
                    result[i] = j - i;
                    break;
                }
            }
        }

        return result;
    }
}
