class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        if (!(len == 4 || len == 6)) return false;
        
        for(int i=0; i<len; i++) {
            int ch = (int)s.charAt(i);
            if((65 <= ch && ch <= 90) || 
              (97 <= ch && ch <= 122)) return false;
        }
        return answer;
    }
}