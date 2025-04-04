class Solution {
    public void solution(int n) {
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            if (str.contains("3") || str.contains("6") || str.contains("9")) {
                System.out.print("clap ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(30);
    }
}
