import java.util.*;

public class Solution { 


    public static void main(String[] args) {
        
        /*<aside>
💡 **Question 1**
Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order, return a sorted array of **only** the integers that appeared in **all** three arrays.

**Example 1:**

Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]

Output: [1,5]

**Explanation:** Only 1 and 5 appeared in the three arrays.

</aside> */ 

      int array1[] = {1,2,3,4,5};
      int array2[] = {1,2,5,7,9};
      int array3[] = {1,3,4,5,8};

      List<Integer> commonElements = commonInteger(array1,array2,array3);

      System.out.println(commonElements); 

      System.out.println();






          
        /*<aside>
💡 **Question 2**

Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*

- answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
- answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.

**Note** that the integers in the lists may be returned in **any** order.

**Example 1:**

**Input:** nums1 = [1,2,3], nums2 = [2,4,6]

**Output:** [[1,3],[4,6]]

**Explanation:**

For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].

For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

</aside> */ 


        int nums1[] = {1,2,3};
        int nums2[] = {2,4,6};

        List<List<Integer>> list2 = distinctIntegers(nums1, nums2);
        System.out.println(list2);





      /* Question 3 
💡 Given a 2D integer array matrix, return *the **transpose** of* matrix.

The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

**Example 1:**

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]

Output: [[1,4,7],[2,5,8],[3,6,9]]

</aside> */  

    
  int matrix3[][] = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};

     System.out.println("Input");
     
     printMatrix(matrix3); 


     transposeMatrix(matrix3); 

      System.out.println("Matrix After Transpose : ");
      printMatrix(matrix3);  
      System.out.println();


     
      /*<aside>
💡 **Question 4**
Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is **maximized**. Return *the maximized sum*.

**Example 1:**

Input: nums = [1,4,3,2]

Output: 4

</aside> */ 

   int nums4[] = {1,4,3,2};  

   // Function Calling 

   int result = arrayPairSum( nums4 );

  System.out.println("The maximum sum  : " + result); 



     /*<aside>
💡 **Question 5**
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

Given the integer n, return *the number of **complete rows** of the staircase you will build*.

</aside> */


 int n = 5 ; 
 int resul = arrangeCoins(n);

 System.out.println("The number of stairs that can be formed is : " + resul);




    
        /* Question 6 
💡 Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

**Example 1:**

Input: nums = [-4,-1,0,3,10]

Output: [0,1,9,16,100]

</aside> */ 

 int arr6[] = {-4,-1,0,3,10}; 

 int res6[] = sortedSquare(arr6); 

 for(int num6 : res6) {
    System.out.print(num6 + " ");
 } 

 System.out.println();
      




 /*
💡 **Question 8**

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

*Return the array in the form* [x1,y1,x2,y2,...,xn,yn].

**Example 1:**

**Input:** nums = [2,5,1,3,4,7], n = 3

**Output:** [2,3,5,4,1,7]

**Explanation:** Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

</aside> */
        
       int arr8[] = {2,5,1,3,4,7}; 
       int n8 = 3;  

       int res8[] = shuffleArray(arr8, n8); 

       for(int num8 : res8) {
        System.out.print(num8 + " ");
       }
      System.out.println();






    } 






    // Function Defenition for question 1 

    
    public static List<Integer> commonInteger(int arr1[] , int arr2[] , int arr3[]) {

        // lets intilize three pointer which will point to the arrays respectively 
        int ptr1 = 0; 
        int ptr2 = 0; 
        int ptr3 = 0; 

        List<Integer> result = new ArrayList<>();

        while(ptr1<arr1.length && ptr2<arr2.length && ptr3<arr3.length) {
            if(arr1[ptr1] == arr2[ptr2] && arr2[ptr2] == arr3[ptr3] ) {
                result.add(arr1[ptr1]); 
                ptr1++;
                ptr2++; 
                ptr3++;

            }  else if(arr1[ptr1] < Math.max(arr3[ptr3], arr2[ptr2])) {
                ptr1++;
            } else if(arr2[ptr2] < Math.max(arr3[ptr3], arr1[ptr1])) {
               ptr2++;
            } else {
                ptr3++; 
            }
        } 
        return result;
       
    }  
 

    // Function Defenition for Question2 
    
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






    // Funtion Defenition for Question 3 

    public static void transposeMatrix(int[][] matrix) {  

     for(int i = 0; i<matrix.length; i++) {
        for(int j = i+1; j<matrix.length; j++) { 

            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp; 

        }
     } 
   

    } 

     public static void printMatrix(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            } 
            System.out.println();
        }
     } 


     // Function Defenition for Question 4 

     public static int arrayPairSum(int nums[]) {

        // First sort the array 
        Arrays.sort(nums);

        int sum = 0; 

        // we can see the logic that to find the maxmimum sum from minimum elements those min elements comes at even index 

        for(int i = 0; i<nums.length; i += 2) {
            
            sum += nums[i]; 
        } 
        return sum;  
     }



     // Funtion Defention for question 5

     public static int arrangeCoins(int n) {  

        
    int count = 1; 

    while(n>0) {
        n = n-count; 

        if(n<0) {
            break; 
        } 
        count++;
    } 

    return count-1; 

     } 



// Function Defenition for Question 6 


   public static int[]  sortedSquare(int nums[]) {
        
    for(int i = 0; i<nums.length; i++) {
        nums[i] = nums[i]*nums[i];
    } 

      Arrays.sort(nums); 
      return nums;
      
   }


// Funtion Defenition for question 8 

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
    





   
}