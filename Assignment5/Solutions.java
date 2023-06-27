import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solutions { 

   

    public static void main(String[] args) {
        
System.out.println("Answer 1 ");

        /*<aside>
💡 **Question 1**

Convert 1D Array Into 2D Array

You are given a **0-indexed** 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using **all** the elements from original.

The elements from indices 0 to n - 1 (**inclusive**) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (**inclusive**) should form the second row of the constructed 2D array, and so on.

Return *an* m x n *2D array constructed according to the above procedure, or an empty 2D array if it is impossible*.

</aside> */ 

 int num1[] = {1,2,3,4}; 
 int n = 2; 
 int m = 2;  
 
 int res1[][] = arraysConversion(num1, n, m);
     
 for(int i = 0; i< res1.length; i++) {
    for(int j = 0; j<res1[0].length; j++) {

        System.out.print(res1[i][j] + " ");
    } 
    System.out.println();
 } 



System.out.println("Answer 2 ");

    /*<aside>
💡 **Question 2**

You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

Given the integer n, return *the number of **complete rows** of the staircase you will build*.

</aside> */ 

     int coins = 5; 
     
     int res2 = arrangeCoins(coins);
     System.out.println("The Number of rows that can be formed is : " + res2);
    


System.out.println("Question 3 - ");

 /*<aside>
💡 **Question 3**

Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

**Example 1:**

**Input:** nums = [-4,-1,0,3,10]

**Output:** [0,1,9,16,100]

**Explanation:** After squaring, the array becomes [16,1,0,9,100].

After sorting, it becomes [0,1,9,16,100].

</aside> */

int nums3[] = {-4,-1,0,3,10};

int res3[] = sortedSquare(nums3); 

 for(int num3 : res3) {
    System.out.print(num3 + " ");
 } 
 System.out.println();
    

System.out.println("Question 4 ");
/*Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*

- answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
- answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.

**Note** that the integers in the lists may be returned in **any** order.

**Example 1:**

**Input:** nums1 = [1,2,3], nums2 = [2,4,6]

**Output:** [[1,3],[4,6]] */
 
 
 int numm1[] = {1,2,3};
 int numm2[] = {2,4,6}; 

 List<List<Integer>> lisst = distinctIntegers(numm1, numm2);
 System.out.println(lisst);



    System.out.println("Question 6 ");

 /*<aside>
💡 **Question 6**

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears **once** or **twice**, return *an array of all the integers that appears **twice***.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

**Example 1:**

**Input:** nums = [4,3,2,7,8,2,3,1]

**Output:**

[2,3]

</aside> */ 


  int nums6[] = {4,3,2,7,8,2,3,1};

  List<Integer> res6 =  duplicateReturn(nums6);
  System.out.println(res6);




  /*<aside>
💡 **Question 7**

Suppose an array of length n sorted in ascending order is **rotated** between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

- [4,5,6,7,0,1,2] if it was rotated 4 times.
- [0,1,2,4,5,6,7] if it was rotated 7 times.

Notice that **rotating** an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of **unique** elements, return *the minimum element of this array*.

You must write an algorithm that runs in O(log n) time.

**Example 1:**

**Input:** nums = [3,4,5,1,2]

**Output:** 1

</aside> */

  System.out.println("Answer 7 ");
   int nums7[] = {3,4,5,1,2}; 
   
   System.out.println(findMin(nums7));
 } 









    // Function Defenition for Question 1 
     public static int[][] arraysConversion(int original[], int row, int cols) {

        if(original.length != row*cols) {
            return new int[0][0];
        } 

        // create a 2D array of size m*n 

        int two2D[][] = new int[row][cols];

     // To access the 1 D array 
     int index = 0; 

     for(int i =0 ; i< row; i++) {
        for(int j = 0; j< cols; j++) {
             two2D[i][j] = original[index];
             index++;  
        }
     }
        return two2D; 
    }


// Function Defenition for Quesition 2 

 public static int arrangeCoins(int coins) {

        int count = 1; 

        while(coins> 0) {
            
          coins = coins-count; 

            

          if(coins<0) {
            break; 
          } 
          count++;
          
        } 
        // number of rows formed 
        return count-1; 
    }
 
    
// Funtion Defenition for Quesiton 3 

 public static int[] sortedSquare(int nums[]) {
     
    // First square the elements in the array 

     for(int i = 0; i<nums.length; i++) {
        nums[i] = nums[i]*nums[i];
     } 

     // lets sort the array 
     // 1. create a new array 

     int newArray[] = new int[nums.length];
     
      // initilize two pointers 
      
      int ptr1 = 0; 
      int ptr2 = nums.length-1; 

       for(int i = newArray.length-1; i>=0; i--) {
         
        if(nums[ptr1] > nums[ptr2]) {
             newArray[i] = nums[ptr1];
             ptr1++; 
        } else if(nums[ptr1] < nums[ptr2]) {
            newArray[i] = nums[ptr2];
            ptr2--; 
        } else if(ptr1 == ptr2) {
            newArray[0] = nums[ptr1]; 
        }
        
       } 

       return newArray;

      }


    
      // Function Defenition for Question 4 

      public static List<List<Integer>> distinctIntegers(int arr1[] , int arr2[]) {
         
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : arr1) {
            set1.add(num);
            
        } 
        for(int num : arr2) {
            set2.add(num);
        } 
  
         List<Integer> notInNums1 = new ArrayList<>(); 
         List<Integer> notInNums2 = new ArrayList<>();

         for(int num : set1) {
            if(!set2.contains(num)) {
                notInNums2.add(num);
            }
         }
            
         for(int num : set2) {
            if(!set1.contains(num)) {
                notInNums1.add(num);
            } 
            
         } 
          List<List<Integer>> list = new ArrayList<>();
            
            list.add(notInNums2);
            list.add(notInNums1); 

            return list; 
    }





    // Function Defenition for Question 6 

    public static  List<Integer> duplicateReturn(int nums[]) {

        List<Integer> list = new ArrayList<>(); 
        
        for(int i = 0; i< nums.length; i++) {
            
            int index = Math.abs(nums[i]) - 1; 

            if(nums[index] < 0) {
                list.add(index+1); 
                
            } else {
                nums[index] *= -1; 
            }
        } 

        return list; 
    }
 
 



    // Function Defenition for Question 6 

    public static int findMin(int nums[]) {

        if(nums.length == 0) {
            return -1; 
        } 

        int low = 0; 
        int high = nums.length-1; 

        while(low<high) {
            
            int mid = low + (high - low); 

            if(mid > 0 && nums[mid] < nums[mid-1]) {
                  return nums[mid]; 
            } else if(nums[mid] > nums[high]) {
                 low = mid+1; 
            } else {
                high = mid-1; 
            }
        } 
      
    
      return nums[low]; 
    }

}