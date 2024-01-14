package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizingTheMaximumPairSumOfArray {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = Integer.MIN_VALUE;
        
        int start = 0, end = nums.length-1;
        
        while(start<end){
            int pairSum = nums[start] + nums[end];
            if (pairSum > maxSum) maxSum = pairSum;
            end--;
            start++;
            
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = minPairSum(arr);
        System.out.println("Minimum Pair Sum of array is "+k);
    }
}
