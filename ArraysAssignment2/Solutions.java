import java.util.*;

class Solutions { 

    public static void main(String[] args) {
      
        /*Question 1
        Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2),..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

        Example 1:
        Input: nums = [1,4,3,2]
        Output: 4 */ 
  
      int arr1[] = {1,4,3,2}; 

      // Function Calling  
      int result = FindMaxSumOfMinElements(arr1); 
      System.out.println("The Maximum sum of minimum elemetns is : " + result );



    

        /* Question 2 
        
        Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor. 

        The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice. 

         Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

         Example 1:
         Input: candyType = [1,1,2,2,3,3]
         Output: 3 */ 

           int TotalCandy[] = {1,1,2,2,3,3}; 
           
           // Function Calling   

           int result2 = eatMaxCandyType(TotalCandy); 
           System.out.println("The maximum Different type of candies allice can eat : " + result2);
         

      

            
        
        /* 
         Question 3 
        We define a harmonious array as an array where the difference between its maximum value
         and its minimum value is exactly 1.

        Given an integer array nums, return the length of its longest harmonious subsequence
        among all its possible subsequences.

         A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

         Example 1:
         Input: nums = [1,3,2,2,5,2,3,7]
         Output: 5
        */

         int nums[] = {1,3,2,2,5,2,3,7}; 

          int res3 = longestHarmonicSubsequence(nums); 
          System.out.println("The longest length of harmonic subsequence is :  " + res3);
    

   


              
        /* Question 4 
         You have a long flowerbed in which some of the plots are planted, and some are not.
         However, flowers cannot be planted in adjacent plots.
         Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

         Example 1:
         Input: flowerbed = [1,0,0,0,1], n = 1
         Output: true */
    

          int flowerbed[] = {1,0,0,0,1}; 
       
           int num4 = 1;  

         // Function Calling 

          boolean result4 = countHowManyFlowerPlanted(flowerbed, num4); 

         System.out.println(result4);
     



   /*Question 5
    Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

    Example 1:
    Input: nums = [1,2,3]
    Output: 6 */ 

      int nums5[] = {1,2,3}; 
      
      // Function calling
      
      int res5 = maxProduct(nums5); 

      System.out.println("The Max product is : " + res5);

    



      
    /*Question 6
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise,
return -1.

You must write an algorithm with O(log n) runtime complexity.

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4

Explanation: 9 exists in nums and its index is 4 */ 


   int  nums6[] = {-1,0,3,5,9,12};
     int target = 9;
  int res6 =  findIndex(nums6, target);  
  
   if(res6 != -1) {
    System.out.println("The element is present at the index : " + res6);
   } else {
    System.out.println("Element not found ");
   }

    


         
/* Question 7 
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true */

    int nums7[] = {1,2,2,3}; 

    // Function Calling 

    boolean result7 = checkMonoatomic(nums7);

    if(result7) {
        System.out.println("The Given array is monoatomic");
    } else {
        System.out.println("The Given array is not monoatomic");
    }




 /*
         * Question 8
     You are given an integer array nums and an integer k.

     In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

     The score of nums is the difference between the maximum and minimum elements in nums.

     Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

     Example 1:
      Input: nums = [1], k = 0
      Output: 0
         */   


         int nums8[] = {1};
          int k = 0; 

          int res8 = findMinScore(nums8, k);

          System.out.println("The minimum score that can be achived is : " + res8);




        
    } 




    // Function Defenition for Quetion 1  

    public static int FindMaxSumOfMinElements(int arr[]) { 
        int sum = 0;  

        // for we have to first sort the array 

         Arrays.sort(arr); 
  
         // Now we will run a loop to sum up the minimum elements 

         for(int i = 0; i<arr.length; i +=2 ) {
             sum += arr[i]; 
         } 

         return sum; 
    } 



    
    // Function Defenition For Question 2 

    public static int eatMaxCandyType(int totalCandy[]) {
     
        // We have to use HashSet to know about the unique Candies or avoid Duplicates 

        HashSet<Integer> uniqueCandies = new HashSet<>();  
       
        // Maximum Different Types of Candies allice can eat 

        int maxCandies = totalCandy.length/2; 

        // now add elements to HashSet from the given array 
        
        for(int addType : totalCandy) {
            uniqueCandies.add(addType);
        } 

        int totalDifferentCandies = uniqueCandies.size();

        // now we will compare the maxDifferentcandies and total candies allice can eat
        // We have to return Max different candies allice can eat so we will return the minmum of the two 

        return Math.min(totalDifferentCandies,maxCandies);

    }




    // Function Defenition for Question 3 

    
    public static int longestHarmonicSubsequence(int arr[]) {

        // Create a Hashmap 

        Map<Integer,Integer> frequencyCounter =  new HashMap<>();
       
        // lets update the frequency in tha map 

        for(int num : arr) {  
            
            int curFreq = frequencyCounter.getOrDefault(num, 0);
            frequencyCounter.put(num,curFreq+1);
        }  

        int maxLen = 0; 
         
        // Iterating through the numbers and calculate the length of the HarmonicSubsequece 

        for(int num : arr) { 
            int length = 0;
            if(frequencyCounter.containsKey(num+1)) {
                 length = frequencyCounter.get(num) + frequencyCounter.get(num+1);
            } 
            maxLen = Math.max(maxLen,length);
        } 
        return maxLen; 

    }  
    

// Function Defenition for question 4 

   
    public static boolean countHowManyFlowerPlanted(int arr[] , int n ) {

        int count = 0; 
      //  boolean flag = false; 
        
       for(int i = 0 ; i<arr.length; i++) {
        if(arr[i] == 0) { 
            int prev = 1; int next = 1; 
            if(i == 0 || arr[i-1] == 0) {
                prev =0;
            } 
            if(i == arr.length-1 || arr[i+1] == 0) {
                next = 0;
            } 


            if(prev ==0 && next ==0) {
                arr[i] = 1; 
                count++; 

             }
        }
       } 

       if(count>= n) {
        return true; 
       } else {
        return false;
       }
             
    }
      
 

    // Function Definition for Question 5 

     public static int maxProduct(int arr[]) {
        

        int n = arr.length; 

        // First sort the array 

        // if array has all positive integers then the max product will be the sum of last three integers of sorted array in ascending order 
         
        int option1 = arr[n-1] * arr[n-2] * arr[n-3]; 

        // if Array has two negative and one positive integer then the max product will be the sum of first two negative integers and last one positive integer
         int option2 = arr[n-1]*arr[0]*arr[1];

         int maxProduct = Math.max(option1,option2);
         
         return maxProduct;
    }

    // Function Defenition for Question 6 

     

    public static int findIndex(int arr[], int target) {

        int low = 0; 
        int high = arr.length;

        while(low<=high) {

            int mid = low + (high-low)/2; // To avoid overflow 

            if(arr[mid] == target) {
                return mid; 
            } else if(arr[mid]< target) {
                low = mid+1; 
            } else {
                high = mid-1;
            }
            

        } 
               return -1;
    } 

      

    // Function definition for Question 7 

     public static boolean checkMonoatomic(int arr[]) {

        boolean inc = true; 
        boolean dec = true; 

        for(int i = 0; i<arr.length-1; i++) {
            if(arr[i] < arr[i+1]) {
              dec = false;
                 
            }  

             if(arr[i] > arr[i+1]) {
             inc = false;
             }    
        } 
       return inc || dec;
    
    }

    
    // Function Definition for Question 8 


    public static int findMinScore(int arr[] , int k) {
        
        Arrays.sort(arr); 
        
         int n = arr.length; 

         int dif = arr[n-1] - arr[0]; 

         if(dif<= 2*k ) {
            return 0; 
         } else {
            return dif-2*k;
         }

    }
    


 }