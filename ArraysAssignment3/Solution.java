import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {  

    public static void main(String[] args) {
        

        /*Question 1
       Given an integer array nums of length n and an integer target, find three integers
       in nums such that the sum is closest to the target.
        Return the sum of the three integers.

       You may assume that each input would have exactly one solution.

       Example 1:
        Input: nums = [-1,2,1,-4], target = 1
        Output: 2

        Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2). */ 

       int nums[] = {-1,2,1,-4}; 
       int target1 = 1; 

        int result = closestSum(nums, target1);

        System.out.println("The Sum of three integers is  : " + result);





     /*Question 2
      Given an array nums of n integers, return an array of all the unique quadruplets
      [nums[a], nums[b], nums[c], nums[d]] such that:
           ● 0 <= a, b, c, d < n
           ● a, b, c, and d are distinct.
           ● nums[a] + nums[b] + nums[c] + nums[d] == target

         You may return the answer in any order.

         Example 1:
         Input: nums = [1,0,-1,0,-2,2], target = 0
         Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]] */

         int nums2[] = {1,0,-1,0,-2,2};
         int target2 = 0; 

         // funtion calling 

          List<List<Integer>> result2 = fourSum(nums2, target2);

          System.out.println(result2);


      

    /*<aside>
💡 **Question 3**
A permutation of an array of integers is an arrangement of its members into a
sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr:
[1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

The next permutation of an array of integers is the next lexicographically greater
permutation of its integer. More formally, if all the permutations of the array are
sorted in one container according to their lexicographical order, then the next
permutation of that array is the permutation that follows it in the sorted container.

If such an arrangement is not possible, the array must be rearranged as the
lowest possible order (i.e., sorted in ascending order).

● For example, the next permutation of arr = [1,2,3] is [1,3,2].
● Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
● While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not
have a lexicographical larger rearrangement.

Given an array of integers nums, find the next permutation of nums.
The replacement must be in place and use only constant extra memory.

**Example 1:**
Input: nums = [1,2,3]
Output: [1,3,2]

 */

      
        int arr3[] = {1,3,5,4,2}; 
        int result3[] = nextPermutation(arr3); 
         System.out.println("The Next Permutation is :  ");
        for(int nums3 : result3) {
            System.out.print(nums3 + " ");
        }
        System.out.println();
    



            
        /*Question 4
Given a sorted array of distinct integers and a target value, return the index if the
target is found. If not, return the index where it would be if it were inserted in
order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2 */ 
  
   int arr4[] = {1,3,5,6}; 
   int target = 5; 

   // Function Calling 

   int res4 = findTarget(arr4, target);
   System.out.println("The index is : " + res4);

 




       /*<aside>
💡 **Question 5**
You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant
to least significant in left-to-right order. The large integer does not contain any
leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

**Explanation:** The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

</aside> */ 

        int arr5[] = {1,2,3}; 

        int res5[] = changeArray(arr5); 

        for(int n5 : res5) {
            System.out.print(n5 + " ");
        } 
        System.out.println();




      
        /*Question 6
Given a non-empty array of integers nums, every element appears twice except
for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only
constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1 */ 


 int nums6[] = {2,2,1}; 

  int res6 = singleElement(nums6); 
  System.out.println("The Single repeatinig element in the array : " + res6 );
 









    } 



    // Function Definition for question 1 

     public static int closestSum(int arr[] , int target) {
         
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        int result = arr[0]+arr[1]+arr[2]; 
        
         for(int i = 0; i<arr.length-2; i++) {

            int left = i+1; int right = arr.length-1;

            while(left<right) {
                int sum = arr[i] + arr[left] + arr[right];  

                if(sum == target) {
                    return sum; 
                } else if(sum>target) {
                    right--;
                }  else {
                    left++;
                }                
                int currDifference = Math.abs(sum-target); 

                if(currDifference<minDifference) {
                    result = sum; 
                    minDifference = currDifference; 
                }
            } 
            
         }
       return result; 
    } 



    // Function Defenition for Question 2 

     public static List<List<Integer>> fourSum(int arr[] , int target) {

        Arrays.sort(arr);

        Set<List<Integer>> result = new HashSet<>();

        int n = arr.length;

        for(int i = 0; i<n-3; i++) {
            for(int j = i+1; j<n-2; j++) {
                
                int left = j+1; 
                int right = n-1; 
                 
                while(left<right) {
                  int sum = arr[i] + arr[j] + arr[left] + arr[right];  

                  if(sum == target) {
                    result.add(Arrays.asList(arr[i],arr[j],arr[left], arr[right]));
                    left++;
                    right--;
                  } else if(sum>target) {
                    right--;

                  } else {
                    left++;
                  }
                }
            }
        } 

        return new ArrayList<>(result);
    } 




    // Function Defenition for Question 3 

     // Dictionary method 
    public static int[] nextPermutation(int arr[]) {
       int index1 = 0;
       int index2 = 0; 
        int i = arr.length-2; 
        int j = arr.length-1; 
        
        while(i>= 0) {
            if(arr[i] <= arr[i+1]) {
                index1 = i;
                break;
            }  
            i--;
        }
         
        while(j>=0) {
           if(arr[index1] <= arr[j]) {
               index2 = j; 
               swap(arr, index1, index2);
               break; 
           } 
           j--;
        }
        
         
        reverseArray(arr, index1+1, arr.length-1);
        return arr;
    } 

    public static void swap(int arr[] , int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    } 

    public static void reverseArray(int arr[], int index1 , int index2) {
       
        while(index1<index2) {
            swap(arr, index1, index2);
            index1++;
            index2--; 

        }
    }  


    
    // Function Defenition  for Question 4 

    public static int findTarget(int arr[] , int target) {
         
        int low = 0; 
        int high = arr.length-1; 
        int index = 0; 

        while(low<high) {
            
            int mid = low+ (high-low)/2; 

            if(arr[mid] == target) {
                return mid;  
            } else if(arr[mid] > target ) { 
                high = mid-1; 
            } else {
                low = mid+1; 
                index = mid;
            }
        }
         return index; 
    } 




 // Function Defenition for Question 5 
    
    public static int[] changeArray(int nums[]) {

          int n = nums.length; 
          int i = n-1;

          while(i>=0) {
            if(nums[i] < 9) {
              nums[i] =   nums[i]+1;
              return nums; 
            } else if(nums[i] == 9) {
                nums[i] = 0; 
                i--; 
            }

          } 
             // For case if all elements are 9 
          int newArr[] = new int[n+1]; 
          newArr[0] = 1; 
          return newArr; 
    } 





    // Function Defenition for Question 6 

      public static int singleElement(int arr[]) {

        int result = 0; 

        for(int num : arr) {

            result ^= num;
        } 

        return result; 
    }




    
}
