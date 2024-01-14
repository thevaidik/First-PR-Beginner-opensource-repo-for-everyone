package Array;

import java.util.*;


public class CheckArmethicSubArrays {
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int left = l[i];
            int right = r[i];

            int[] subarray = Arrays.copyOfRange(nums, left, right + 1);

            result.add(isArithmeticSequence(subarray));
        }

        return result;
    }
    private static boolean isArithmeticSequence(int[] arr) {
        Arrays.sort(arr);

        int commonDifference = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != commonDifference) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        for (int i = 0; i < m; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        System.out.println("Output: " + checkArithmeticSubarrays(nums, l, r).toString());
        
        


    }
}
