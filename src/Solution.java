import java.util.ArrayList;
import java.util.List;

class Solution {

    private List<List<Integer>> res;

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.res = new ArrayList<>();
        int size = 3;
        int sum = 7;
        solution.compute(size, sum, 1 , new ArrayList<>());
        System.out.println(solution.res);

    }

    private void compute(int size, int sum, int start, List<Integer> curItems) {

        if (sum == 0 && size == 0) {
            res.add(new ArrayList<>(curItems));
            return;
        }

        if(size == 0 && sum != 0){
            return;
        }

        for(int i = start ; i<=9 ; i++){
            curItems.add(i);
            compute(size-1 , sum-i , i+1 ,curItems);
            curItems.remove(curItems.size()-1);
        }

    }


}