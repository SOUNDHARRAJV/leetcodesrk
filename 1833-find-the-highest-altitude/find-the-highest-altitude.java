class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] a = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            a[i] = a[i - 1] + gain[i - 1];
        }

        int max = a[0];

        for(int i = 1; i <= n; i++) {
            max = Math.max(max, a[i]);
        }

        return max;
    }
}
