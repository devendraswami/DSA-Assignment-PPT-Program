
class ArraysAssignment{

public static void main(String[] args) {
    

    /*<aside>
💡 **Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
Input: nums = [2,7,11,15], target = 9
Output0 [0,1]

*/  
  
System.out.println("Question 1 ");
 int nums[] = {2,11,7,15}; 

// Function Calling 
int res[] = checkTargetSum(nums, 9); 
  
 if(res[0] == 0 && res[1] == 0) {
    System.out.println("The target is not present as the sum of two elements of the array ");
 } else { 
    System.out.println("The indices of Two numbers is : ");
 for(int i = 0; i<res.length; i++) {
     System.out.print(res[i] + " " );
 }
 } 
 System.out.println();

 

 /*
💡 **Q2.** Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_*,_*]

 */ 
 System.out.println("Question 2 ");

int nums2[] = {3,2,2,3}; 
int val = 3; 

// function Calling 
int count = removeElement(nums2, val); 
System.out.println("The number of elements in the array which are not equal to val is : " + count );




/*
💡 **Q3.** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

**Example 1:**
Input: nums = [1,3,5,6], target = 5 
Output : 2 

 */
 System.out.println("Question 3 ");
 int nums3[] = {1,3,5,6};
 int target = 5; 

 // Function Calling 
 int result = searchInsertionPosition(nums3, target);
 System.out.println("The index for the target element is " + result);



 /*
  
💡 **Q4.** You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]


  */
  System.out.println("Question 4 "); 
int digits[] = {1,2,3}; 

// Function Calling 

int result4[] = increment(digits); 

// print output array 
for(int digts : result4) {
    System.out.print(digts + " ");
}

System.out.println();

/*
💡 **Q5.** You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

**Example 1:**
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
 */  

 
   int nums1[] = {1,2,3,0,0,0};  
   int m = 3; 
   int num2[] = {2,5,6}; 
   int n = 3;  

   // Function Calling 

   int merged[] = mergeArray(nums1, m, num2, n); 
 
System.out.println("question 5 ");
   // Print Array 
   for(int e : merged) {
    System.out.print(e + " ");
   } 

    System.out.println();  



    System.out.println("Question 6 ");
    /*
💡 **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

Output: true
 */ 

     int num6[] = {1,2,3,1}; 
     
     boolean res6 = checkDuplicates(num6); 
     if(res6) {
        System.out.println("Duplicates are present in array ");
     } else {
        System.out.println("Duplicates are not present in array ");
     }
    
     
 
     System.out.println("Question 7 "); 

      /*
💡 **Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1:**
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */ 
 
  int nums7[] = {0,1,0,3,12}; 

    int res7[] = moveZero(nums7); 

    for(int n7 : res7) {
        System.out.print(n7 + " ");
    }
 System.out.println();
  


        System.out.println("Question 8 "); 
    /*
💡 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3] 
 */ 
 // solution if the number which is duplicate are together if they are not together then we have to use to loops 
int nums8[] = {1,2,2,4}; 

int res8[] = removeDup(nums8); 

for(int n8 : res8) {
    System.out.print(n8 + " ");
}

System.out.println();


  





}

 



     // function Defenition for Question 1 

     public static int[] checkTargetSum(int arr[], int target) {
        
        int nums[] = new int[2]; 

        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++ ) {
                
                if(arr[i] + arr[j] == target) {
                    nums[0] = i; 
                    nums[1] = j; 
                    return nums; 
                }
            }
        }


        return nums; 
     }  


     // Function Defenition for Question 2 

     public static int removeElement(int arr[], int val) {

        int count = 0; // Total number of elements in the array which are not equal to val

        for(int i = 0; i<arr.length; i++) {

            if(arr[i] != val) {
                
                arr[count] = arr[i]; 
                count++; 
            } 
        } 
        return count; 
     } 

     
     // Function Defenition for Question 3 

     public static int searchInsertionPosition(int arr[], int target) {
        
      int start = 0; 
      int end = arr.length; 
       
      // we will use binary search for optimised code  

      while(start<=end) {
        
        int mid = (start+end)/2; 
        
        if(arr[mid]== target) {
            return mid; 
        } else if(arr[mid]<target) {
            start = mid+1; 
        } else {
            end = mid-1; 
        } 

      }


      return start; 
    } 


    // Function Defenition for Question 4  

     public static int[] increment(int[] digits) {
       
        int n = digits.length; 

        for(int i= n-1; i>=0; i--) {
            
            if(digits[i]<9) {
                digits[i]++; 
                return digits; 
            } else {
                digits[i] = 0; 
            }
        } 
        return digits; 
    } 


    // Function Defenition for Question number 5 
 
    public static int[] mergeArray(int nums1[], int m, int nums2[] , int n) {
       
        int i = m-1; 
        int j = n-1; 
        int k = m+n-1; 

        while(j>=0) {
            if(i>=0 && nums1[i]>nums2[j]) {
                nums1[k] = nums1[i]; 
                k--;
                i--;

            } else {
                 nums1[k] = nums2[j]; 
                 k--;
                 j--; 
            }
        }


        return nums1;  
    } 


// Function Defenition for Question 6 

      public static boolean checkDuplicates(int arr[]) {
        
        boolean flag = false;  

        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++ ) {
                if(arr[i] == arr[j]) {
                    return true; 
                }
            }
        }

        return flag; 
    }  



 // Function Defenition for Question 7 

  public static int[] moveZero(int arr[]) {
           
         int left = 0; 

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] != 0) { 
                int temp = arr[left]; 
                arr[left] = arr[i]; 
                arr[i] = temp; 
                left++;
            }
        }

        return arr; 
    } 


    // Function Defenition for Question 8 

      public static int[] removeDup(int arr[]) {
       
       for(int i = 0; i<arr.length-1; i++) {
           if(arr[i] == arr[i+1]) {
               arr[i+1] += 1; 
           }
       }  
      

        return arr; 
    }

}