class Solution {
    public int solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = getLcm(arr[i-1], arr[i]);
        }
        return arr[arr.length-1];
    }
    
    public static int getLcm(int a, int b) {
        return a * b / getGcd(a, b);
    }

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
}