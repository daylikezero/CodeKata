import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> destroy = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        List<LocalDate> privacyList = new ArrayList<>();
        for (String term : terms) {
            String[] split = term.split(" ");
            termMap.put(split[0], Integer.parseInt(split[1]));
        }
        for (String privacy : privacies) {
            String[] split = privacy.split(" ");
            LocalDate privacyDate = LocalDate.parse(split[0], DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            privacyDate = privacyDate.plusMonths(termMap.get(split[1])).minusDays(1);
            privacyList.add(privacyDate);
        }
        LocalDate todayDate = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        int count = 1;
        for (LocalDate date : privacyList) {
            if (todayDate.isAfter(date)) {
                destroy.add(count);
            }
            count++;
        }
        return destroy.stream().mapToInt(i -> i).toArray();
    }
}