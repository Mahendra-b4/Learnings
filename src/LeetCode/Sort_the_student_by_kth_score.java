package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Sort_the_student_by_kth_score {
    public static void main(String[] args) {
        int[][] score = {{64766,11978,20502,21365,79611,36797,58431,89540,59373,25955},
                         {23358,84599,4675,20979,76889,34630,64098,23468,71448,17848},
                         {93306,92793,54009,9715,24354,24895,20069,93332,73836,64359},
                         {51305,66104,88468,5333,17233,32521,14087,42738,46669,65662}};
        int k = 5;
        int[][] ans = sortTheStudents(score, k);
        for(int i=0 ; i<4 ; i++)
            System.out.println(Arrays.toString(ans[i]));
    }
    public static int[][] sortTheStudents(int[][] score, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = score.length;
        for(int i=0 ; i<n ; i++){
            hm.put(score[i][k], i);
            pq.add(score[i][k]);
        }
//        int[] tmp = new int[n];
        for(int i=0 ; i<=n/2 ; i++){
            int val = pq.poll();
//            System.out.println("val = "+val);
            int ind = hm.get(val);
//            System.out.println("ind = "+ind);
            int[] tmp = score[i];
//            System.out.println("tmp = "+ Arrays.toString(tmp));
            score[i] = score[ind];
            score[ind] = tmp;
//            System.out.println("score[i] = "+Arrays.toString(score[i]));
        }
        return score;
    }
}
