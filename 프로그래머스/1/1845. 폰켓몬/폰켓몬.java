import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return map.size() > max ? max : map.size();
    }
}