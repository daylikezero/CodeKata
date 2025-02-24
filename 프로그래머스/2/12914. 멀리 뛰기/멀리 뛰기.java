class Solution {
    public long solution(int n) {
        return recursion(n, 0, 1);
    }
    
    private long recursion(int n, long a, long b) {
        long sum = a+b;
        if (n <= 1) {
            return sum % 1234567;
        } else {
            sum = recursion(n-1, b, sum%1234567);
        }
        return sum%1234567;
    }
}