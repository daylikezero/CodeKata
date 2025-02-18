class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        int start = 3;
        int end = area / 3;
        for (int width = start; width <= end; width++) {
            for (int height = start; height <= end; height++) {
                if((width*height==area) && ((width-2)*(height-2)==yellow) && width >= height){
                    answer[0] = width;
                    answer[1] = height;
                    return answer;
                }
            }
        }
        return answer;
    }
}