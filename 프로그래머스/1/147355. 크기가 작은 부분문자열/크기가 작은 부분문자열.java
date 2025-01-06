class Solution {
    public int solution(String t, String p) {
        long number = Long.parseLong(p);
        int count = 0;

        int pLength = p.length();
        for(int i=0; i<=t.length()-pLength; i++) {
            if(Long.parseLong(t.substring(i, i+pLength)) <= number) {
                count++;
            }
        }
        return count;
    }
}