import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 명예의전당 {
    public static void main(String[] args) {
        var a = solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        for (int b : a) {
            System.out.println(b);
        }
    }

    public static int[] solution(int k, int[] score) {
        ArrayList<Integer> cache = new ArrayList<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            if (cache.size() < k) {
                cache.add(score[i]);
            } else {
                if (score[i] > cache.get(0)) {
                    cache.add(score[i]);
                    cache.remove(cache.get(0));
                }
            }
            Collections.sort(cache);
            answer[i] = cache.get(0);
        }
        return answer;
    }
}
