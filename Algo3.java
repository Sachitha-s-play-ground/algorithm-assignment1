public class Algo3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] oppositeArray = new int[nums.length];

        for (int i = 0; i < oppositeArray.length; i++) {
            oppositeArray[i]=nums[nums.length-1-i];
        }

        nums=oppositeArray;

        for (int i = 0; i < oppositeArray.length; i++) {
            System.out.print(nums[i]+" ,");
        }
        System.out.print("\b");
    }
}
