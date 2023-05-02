import java.util.Scanner;

public class CBBExercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = teclado.nextInt();
        }
        int maiorNum = nums[0];

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > maiorNum) {
                maiorNum = nums[j];
            }
        }

        System.out.println("O maior número no array é: " + maiorNum);
    }
}
