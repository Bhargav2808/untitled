package HashMap_and_HashSet;

import java.util.HashMap;

public class HashMapChallenge3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int num[] = {10, 2, -2, -20, 10};
        int k = -10;
        int sum = 0;
        for(int i : num){
            sum = sum +i;
            map.put(i, sum);
        }
        int count =0;
        for(int i : map.values()){
            if(map.containsValue(i-k)){
                count++;
            }
        }
        System.out.println(count);
    }
}
