package Array;

import java.util.Scanner;

public class SumOfSubArryIsZero {
    public static boolean findsum(int arr[],int n)
    {
        //Your code here
        for(int i=0; i<n;i++){
            int temp=i+1;
            int sum = arr[i];
            while(sum!=0 && temp<n){
                sum+=arr[temp];
                temp++;
            }
            if (sum ==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        if(findsum(arr,n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }   
}
