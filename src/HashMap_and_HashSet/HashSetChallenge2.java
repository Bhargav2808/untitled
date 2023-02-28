package HashMap_and_HashSet;

import java.util.HashSet;

public class HashSetChallenge2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int num1[] = {5, 6, 9};
        int num2[] = {1, 2, 3, 4, 5, 6, 7, 8};

        for(int i : num1){
            set.add(i);
        }
        int count=0;
        for(int i : num2){
            if(set.contains(i)){
                count++;
                set.remove(i);
            }
        }
        System.out.println(count);
    }
}
