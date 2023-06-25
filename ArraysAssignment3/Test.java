import java.util.Arrays;
import java.util.Comparator;

class Test { 

    public static boolean canAttendAllMeetings(int[][] intervals ) {

        boolean flag = true;
       
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));

        // Now lets check overLapping intevals 

        for(int i = 1; i<intervals.length; i++) {
            if(intervals[i][0]<intervals[i-1][1]) {
                return false; 
            }
        }

        return flag; 
    }
 
    public static void main(String[] args) {
       /*Question 8
Given an array of meeting time intervals where intervals[i] = [starti, endi],
determine if a person could attend all meetings.

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false */ 
         
      int[][] intevals = {{0,30} , {5,10} , {15,20}}; 
       
      System.out.println(canAttendAllMeetings(intevals));
    }
}