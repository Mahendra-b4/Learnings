package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangel_II {
    public static List<Integer> getRow(int rowIndex) {
//        List<List<Integer>> ans = new List<ArrayList<>>();
        List<Integer> aa = new ArrayList<>();
        aa.add(1);
        List<Integer> bb = new ArrayList<>();
        bb.add(1);
        bb.add(1);
        if(rowIndex == 0) return aa;
        if(rowIndex == 1) return bb;
        int present_row = 1;
        while(present_row < rowIndex){
            aa.clear();
            System.out.println("size = "+bb.size());
            for(int i=0 ; i<bb.size() ; i++){
                if(i == 0)
                    aa.add(1);
                else{
                    aa.add(bb.get(i-1)+bb.get(i));
                }
            }
            aa.add(1);
            bb = new ArrayList<>(aa);
            System.out.println("bb = "+bb);
            present_row++;
        }
        return bb;
    }

    public static void main(String[] args) {
        System.out.println(getRow(4));
    }
}
