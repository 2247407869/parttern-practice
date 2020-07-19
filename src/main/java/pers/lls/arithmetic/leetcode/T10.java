package pers.lls.arithmetic.leetcode;

public class T10 {
    public boolean isMatch(String s, String p) {
        int slength = s.length();
        int plength = p.length();
        boolean[][] dp = new boolean[slength+1][plength+1];
        dp[0][0] = true;
        for (int i =0;i<slength+1;i++){
            for (int j = 1; j < plength + 1; j++) {
                if (p.charAt(j-1) !='*'){
                    dp[i][j] = check(s,p,i-1,j-1) && dp[i-1][j-1];
                }else {
                    if (i!=0&&s.charAt(i-1) == p.charAt(j-2)){
                        dp[i][j] = (dp[i-1][j] || dp[i][j-2]);
                    }else {
                        dp[i][j] = dp[i][j-2];
                    }
                }
            }
        }
        return dp[slength][plength];
    }

    private boolean check(String s, String p, int i, int j) {
        if (i<0)return false;
        return s.charAt(i) == p.charAt(j) || p.charAt(j) == '.';
    }

    public static void main(String[] args) {
        System.out.println(new T10().isMatch("aa","a*"));
    }
}