public class CBBExercicio03 {
    public static void main(String[] args) {
        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
    }    
}