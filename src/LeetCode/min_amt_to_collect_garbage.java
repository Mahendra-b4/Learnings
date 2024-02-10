package LeetCode;

public class min_amt_to_collect_garbage {
    public static void main(String[] args) {
        String[] garbage = {"MMM","PGM","GP"};
        int[] travel = {3, 10};
        System.out.println(solver(garbage, travel));
    }

    static int ans = 0;
    public static int solver(String[] garbage, int[] travel){

        int n = garbage.length;
        for(int i=0 ; i<n-1 ; i++){
            ans += 3*travel[i];
        }
        for(String k:garbage){
            ans += k.length();
        }
        solve(garbage, travel, ans, "G", n);
        solve(garbage, travel, ans, "M", n);
        solve(garbage, travel, ans, "P", n);
        return ans;
    }
    public static void solve(String[] garbage, int[] travel, int ans, String c, int n){
        for(int i=n-1 ; i>0 ; i--){
            if(!garbage[i].contains(c))
                ans -= travel[i-1];
            else break;
        }
    }
    public static int garbageCollection(String[] garbage, int[] travel) {
        int final_ans = 0;
        final_ans += solver(garbage, travel, 0, 'G');
        System.out.println("1 = "+ final_ans);
        final_ans += solver(garbage, travel, 0, 'P');
        System.out.println("2 = "+ final_ans);
        final_ans += solver(garbage, travel, 0, 'M');
        System.out.println("3 = "+ final_ans);
        return final_ans;
    }

    public static int solver(String[] garbage, int[] travel, int final_ans, char cur){
        int n = garbage.length;
        int flag = 0;
        int cur_sum = 0;
        int path = 0;
        for(int i=0 ; i<garbage[0].length() ; i++){
            if(garbage[0].charAt(i) == cur) cur_sum++;
        }
        System.out.println("cur = "+cur + "  cur_sum = "+cur_sum);
        final_ans += cur_sum;
        cur_sum = 0;
        for(int i=1 ; i<n ; i++){
            for(int j=0 ; j<garbage[i].length() ; j++){
                if(garbage[i].charAt(j) == cur){
                    cur_sum++;
                    flag++;
                }
            }
            path += travel[i-1];
            if(flag != 0){
                System.out.println("cur = "+cur+" i = "+i+" flag = "+flag);
                cur_sum += path;
                final_ans += cur_sum;
                cur_sum = 0;
                flag = 0;
                path = 0;
            }
        }
        return final_ans;
    }
}
