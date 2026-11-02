import java.util.List;

public class InsertionSort_Lab21 implements Sorting<Integer>{
    @Override
    public void sort(List<Integer> nums) {
        for(int left = 1 ; left < nums.size() ; left ++ ) {
            int val = nums.get(left);
            int j = left;
            while(j > 0 && nums.get(j-1) > val) {
                nums.set(j,nums.get(j-1));
                j--;
            }
            nums.set(j, val);
        }
        return;
    }
}
