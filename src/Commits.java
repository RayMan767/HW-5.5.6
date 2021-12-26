public class Commits {
    private double[] nums;


    public Commits(double[] nums) {
        this.nums = nums;
    }

    public double getMax() {
        double rezult = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > rezult)
                rezult = nums[i];
        }

        return rezult;
    }
}
