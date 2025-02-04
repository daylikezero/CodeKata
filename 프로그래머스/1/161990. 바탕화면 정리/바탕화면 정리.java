import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(String[] wallpaper) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        Integer maxRow = row.stream().max(Integer::compare).get();
        Integer minRow = row.stream().min(Integer::compare).get();
        Integer maxCol = col.stream().max(Integer::compare).get();
        Integer minCol = col.stream().min(Integer::compare).get();


        return new int[]{minRow, minCol, maxRow+1, maxCol+1};
    }
}