import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int result = 0;
        int count = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(Integer::compareTo);

        for (Integer key : list) {
            map.put(key, map.getOrDefault(key, 0) - 1);
            result++;
            if (--count == 0) {
                return result;
            }
        }
        return result;
    }
}