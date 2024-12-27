class Solution {
    public int solution(int num) {
        long temp = num;
        int count = 0;
        while (temp != 1 && count <= 500) {
            temp = temp % 2 == 0 ? temp / 2 : temp * 3 + 1;
            count++;
        }
        return count <= 500 ? count : -1;
    }
}