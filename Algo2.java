public class Algo2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8,23} ;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                int x=nums[j];
                int y=nums[j+1];
                if(nums[j]>nums[j+1]){
                    nums[j]=y;
                    nums[j+1]=x;
                }
            }
        }
        System.out.println("Minimum number is: "+nums[0]);
        System.out.println("Maximum number is: "+nums[nums.length-1]);
    }
}
