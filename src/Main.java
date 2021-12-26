public class Main {
    public static void main(String[] args) {
        double[] nums = {1, 10, 0, -6};

        Commits commits = new Commits(nums);

        System.out.println("Maximalnoe cislo: " +  commits.getMax());

        System.out.println("Minimalnoe cislo: " + commits.getMin());
    }
}
