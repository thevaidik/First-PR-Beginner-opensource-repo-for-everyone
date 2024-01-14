package Array;
import java.util.*;
public class Leetcode376Solution {
        public int[] findMissingAndRepeatedValues(int[][] grid) {
            
            
            int l=grid.length;
            
            int t=grid[0].length;
            
            int resu=l*t;
            
            int utter[] = new int[2];
            HashSet<Integer> hashmaps = new HashSet<>();
            HashSet<Integer> hashmap_in_differentset = new HashSet<>();
    
            
            for(int i=1;i<=resu;i++){
                
                hashmap_in_differentset.add(i);
            }
            
            for(int i=0;i<l;i++){
                
                for(int j=0;j<t;j++){
                    
                    int val=grid[i][j];
                    
                    hashmap_in_differentset.remove(val);
                    
                    if(hashmaps.contains(val)){
                        utter[0]=val;
                    }else{
                        hashmaps.add(val);
                    }
                }
            }
            
            for(Integer g:hashmap_in_differentset){
                
                utter[1]=g;
            }
            
            return utter;
            
        }
        public int[][] divideArray(int[] nums, int k) {
               Arrays.sort(nums);
       
              
               List<int[]> ans = new ArrayList<>();
               int count = 0;
               int l = nums.length;
       
               
               for (int i = 0; i <l; i += 3) {
                   
                   if (nums[i + 2] - nums[i] <= k) {
                       
                       ans.add(new int[]{nums[i], nums[i + 1], nums[i + 2]});
       
                      
                       count++;
                   } else {
                       
                       return new int[0][];
                   }
               }
       
               
               int[][] ker = new int[count][];
               for (int i = 0; i < count; i++) {
                   ker[i] = ans.get(i);
               }
       
               
        
               return ker;
        }
        public long minimumCost(int[] nums) {
            Arrays.sort(nums);
            int size = nums.length;
    
            // Find the median of the sorted array
            int bichki = nums[size / 2];
    
            // Initialize the total cost
            long howManyCost = 0;
    
            // Calculate the total cost by iterating through each element
            for (int i = 0; i < size; i++) {
                howManyCost += Math.abs(nums[i] - bichki);
            }
    
            return howManyCost;
        }
    
}
