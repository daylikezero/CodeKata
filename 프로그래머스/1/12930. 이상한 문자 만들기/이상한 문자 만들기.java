class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strs = s.split("\\s", -1);
        for (int i = 0; i<strs.length; i++) {
            String str = strs[i];
            for(int j = 0; j < str.length(); j++) {
                if(j % 2 == 0) {
                    sb.append(str.toUpperCase().charAt(j));
                } else {
                    sb.append(str.toLowerCase().charAt(j));
                }
            }
            if( i != strs.length - 1 ) {
                sb.append(" ");                  
            }
        }
        return sb.toString();
    }
}