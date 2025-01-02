class Solution {
    public int[] solution(int n, int m) {
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        int[] answer = { getGcd(n,m) , getLcd(n,m) };
        return answer;
    }
    
    public static int getGcd(int max, int min) {
        if (min == 0) return max;
        return getGcd(min, max % min);
    }
    
    public static int getLcd(int n, int m) {
        return (n * m) / getGcd(n, m); 
    }
}