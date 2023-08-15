public class Algo4 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < nums.length / 2; i++) {
            int x = nums[i];
            int y = nums[nums.length - 1 - i];
            nums[i] = y;
            nums[nums.length - 1 - i] = x;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ,");
        }
        System.out.print("\b".concat(" \n"));
    }
}
