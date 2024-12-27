class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String[] arr = String.valueOf(x).split("");
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return x % sum == 0;
    }
}