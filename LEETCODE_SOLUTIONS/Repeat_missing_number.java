class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;
        int[] freq = new int[N+1]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }
        int[] ans = new int[2];  
        for (int i = 1; i <= N; i++) {
            if (freq[i] == 0) {
                ans[1] = i;  
            } else if (freq[i] > 1) {
                ans[0] = i;  
            }
        }
        return ans;
    }
}
