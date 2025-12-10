package Recursion;
import java.util.List;
import java.util.ArrayList;
public class Perm {
    private void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums, ds, ans, freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] num){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[num.length];
        recurPermute(num, ds, ans, freq);
        return ans;
    }
    public static void main(String[] args) {
    Perm p = new Perm();
    int[] arr = {1, 2, 3};

    List<List<Integer>> result = p.permute(arr);

    for (List<Integer> permutation : result) {
        System.out.println(permutation);
    }
}
}
