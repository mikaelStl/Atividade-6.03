public class CBBExercicio02 {
    public static void main(String[] args) {
        int[] nums = new int[100];

        for (int i = 0; i < 100; i++) {
            nums[i] = i+1;
        }

        for (int k = 0; k < 100; k++) {
            System.out.print(nums[k] + " ");
        }
    }    
}