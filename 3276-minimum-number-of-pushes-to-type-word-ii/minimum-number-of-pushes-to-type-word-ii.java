public class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        for (char x : word.toCharArray()) {
            int idx = x - 'a';
            count[idx] += 1;
        }

        Arrays.sort(count);
        
        int ans = 0;
        for (int i = 25; i >= 18; i--) {
            ans += count[i] * 1;
        }
        for (int i = 17; i >= 10; i--) {
            ans += count[i] * 2;
        }
        for (int i = 9; i >= 2; i--) {
            ans += count[i] * 3;
        }
        for (int i = 1; i >= 0; i--) {
            ans += count[i] * 4;
        }
        return ans;
    }
}