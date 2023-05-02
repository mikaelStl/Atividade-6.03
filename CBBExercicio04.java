public class CBBExercicio04 {
    public static void main(String[] args) {
        int[] nums = new int[100];

        for (int i = 0; i <= 99; i++) {
            nums[i] = i;
        }

        for (int k = 0; k <= 99; k--) {
            System.out.print(nums[k] + " ");
        }
    }    
}