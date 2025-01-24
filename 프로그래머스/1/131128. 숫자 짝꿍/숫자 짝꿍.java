class Solution {
    public static String solution(String X, String Y) {
       StringBuilder answer = new StringBuilder();

        int[] xCntArr = new int[10];
        int[] yCntArr = new int[10];

        for (String x : X.split("")) {
            xCntArr[Integer.parseInt(x)]++;
        }

        for (String y : Y.split("")) {
            yCntArr[Integer.parseInt(y)]++;
        }

        for (int i = 9; i >= 0; i--) {
            while (xCntArr[i] > 0 && yCntArr[i] > 0) {
                answer.append(i);

                xCntArr[i]--;
                yCntArr[i]--;
            }
        }

        if ("".equals(answer.toString())) {
            return "-1";
        }
        
        if ("0".equals(answer.toString().substring(0, 1))) {
            return "0";
        }
        
        return answer.toString(); 
    }
}