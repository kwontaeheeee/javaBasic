class Solution {
    public void solution(int n) {
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            int clapCount = 0;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '3' || c == '6' || c == '9') {
                    clapCount++;
                }
            }

            if (clapCount > 0) {
                for (int k = 0; k < clapCount; k++) {
                    System.out.print("clap ");
                }
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(30);
    }
}
