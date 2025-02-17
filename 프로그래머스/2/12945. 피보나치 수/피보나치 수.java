class Solution {
    public int solution(int n) {
        int answer = fibonacci(n);
        return answer % 1234567;
    }
    
    public static int fibonacci(int n) {
        int[] fibo = new int[n + 1]; // 메모리제이션
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1234567; 
        }
        return fibo[n];
    }
}