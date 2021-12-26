public class Commits {
    private int[] nums;


    public Commits(int[] nums) {
        this.nums = nums;
    }

    public int getMax() {
        int rezult = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > rezult)
                rezult = nums[i];
        }

        return rezult;
    }
}
