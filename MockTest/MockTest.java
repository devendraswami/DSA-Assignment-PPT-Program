import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class MockTest {

  
    public static void main(String[] args) { 


        /* Question 1 
          Given an integer array nums , move all 0's to the end of it while maintining t
          the relative order of the non - zero elements 
         */
        
         int arr[] = {0,1,0,3,12}; 
         //int arr[] = {0}; 

        int result[] = moveZeros(arr); 
        for(int num : result) {
            System.out.print(num + " "); 
        } 
        System.out.println();

     
        /* Quesiton 2 
          Given a String s, find the first non - repeating character in it and return
          its index . If it does not exist return -1. 
         */
     
         String str = "LeetCode"; 
         String str2 = "LoveLeetCode";
       //   int res2 = FirstNonReapatingIndex(str);   
          int res2 = FirstNonReapatingIndex(str2);   
         


         if(res2 != -1) {
            System.out.println("The first non repeating character is present at index : " + res2);
            System.out.println("The Character is : " + str2.charAt(res2) );
    
         } else {
            System.out.println("Non repaeating character does not found");
         }


    } 




    // Function Defintition for Question 1 
      public static int[] moveZeros(int arr[]) { 

        if(arr.length < 2) {
            return arr;
        }
       
        int i = 0; 
        int j = i+1; 

        while(j<arr.length) {
          
            if(arr[i] == 0 && arr[j] != 0) 
            {
                swap(arr, i, j);
                i++; 
                j++;
            }  else if(arr[j] == 0) {
                j++; 
            } else if(arr[i] != 0) {
                i++;
            }
              

        }

        return arr; 
    } 

    public static void swap(int arr[] , int index1, int index2 ) {

         int temp = arr[index1]; 
         arr[index1] = arr[index2]; 
         arr[index2] = temp;  
         
    }

  


    // First non repeating character 
      
   public static int FirstNonReapatingIndex(String str) {
     
     Map<Character,Integer> freqMap = new HashMap<>(); 

     for(char cc : str.toCharArray()) {
           
        int currFreq = freqMap.getOrDefault(cc,0);

        freqMap.put(cc,currFreq+1);
     } 
     

     for(int i = 0; i<str.length(); i++) {
          
        char  cc = str.charAt(i);

        if(freqMap.get(cc) == 1) {
            return i; 
        }
     }

    return -1; 
   
} 




}