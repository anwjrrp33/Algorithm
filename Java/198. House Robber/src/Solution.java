public class Solution {
    public static int rob(int[] nums) {
        int len = nums.length;

        if(len == 1) {
            return nums[0];
        }

        int[][] dp = new int[len][2];

        dp[0][0] = nums[0];
        dp[0][1] = 0;

        dp[1][0] = nums[1];
        dp[1][1] = nums[0];

        for(int i = 2; i < len; i++){
            dp[i][0] = Math.max(dp[i - 2][0], dp[i - 1][1]) + nums[i];
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        }

        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }

    public static void main(String[] args) {
        int result = rob(new int[]{ 9, 1, 3, 1, 2, 3 });
        System.out.println(result);
    }

    public static void console(int[][] dp) {
        for(int[] arr: dp) {
            System.out.print("{ ");
            for(int i: arr) {
                System.out.print(i + " ");
            }
            System.out.print("} ");
        }
        System.out.println();
    }
}
