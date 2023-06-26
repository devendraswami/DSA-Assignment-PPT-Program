import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {  
 
    public static int[] shuffleArray(int nums[] , int n) {

        int newArray[] = new int[nums.length]; 

        int low = 0; 
        int mid = n; 
        int i = 0; 

        while(low<n) {
            newArray[i] = nums[low];
            newArray[i+1] = nums[mid]; 

            low++;
            mid++; 
            i += 2; 

        } 
        return newArray; 
    }
    
    public static void main(String[] args) {
     /*<aside>
💡 **Question 8**

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

*Return the array in the form* [x1,y1,x2,y2,...,xn,yn].

**Example 1:**

**Input:** nums = [2,5,1,3,4,7], n = 3

**Output:** [2,3,5,4,1,7]

**Explanation:** Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

</aside> */
        
       int arr8[] = {2,5,1,3,4,7}; 
       int n = 3;  

       int res8[] = shuffleArray(arr8, n); 

       for(int num8 : res8) {
        System.out.print(num8 + " ");
       }
      System.out.println();
    }
    
}
