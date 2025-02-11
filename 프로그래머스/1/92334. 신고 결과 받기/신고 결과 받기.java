import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String,Map<String,Integer>> hm = new HashMap<>();
        LinkedHashMap<String,Integer> result = new LinkedHashMap<>();
        for(String a : id_list){
            result.put(a,0);
        }
        for (String s : report) {
            String[] starr = s.split(" ");
            hm.putIfAbsent(starr[0], new HashMap<>());
            hm.putIfAbsent(starr[1], new HashMap<>());
            hm.get(starr[1]).put(starr[0], 1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (String s : id_list) {
            if (!hm.containsKey(s)) {
                al.add(0);
            } else {
                int num = hm.get(s).values().stream().mapToInt(integer -> integer).sum();
                if (num >= k) al.add(num);
                else al.add(0);
            }

        }
        int[] answer = al.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0 ; i<answer.length;i++){
            if(answer[i]!=0){
                hm.get(id_list[i]).keySet().forEach(v->{
                    if(result.containsKey(v)){
                        result.put(v,result.get(v)+1);
                    }else{
                        result.put(v,1);
                    }
                });
            }
        }

        return result.values().stream().mapToInt(Integer::intValue).toArray();
    }
}