import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerIndexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }
        for (String calling : callings) {
            int index = playerIndexMap.get(calling);
            String temp = players[index-1];
            players[index-1] = calling;
            players[index] = temp;

            playerIndexMap.put(temp, index);
            playerIndexMap.put(calling, index-1);
        }
        return players;
    }
}