import java.util.HashMap;
import java.util.Map;

public class Test { 
  
    public static boolean checkStraightLine(int coordinates[][]) {
      
        double deltaX = getXDiff(coordinates[0],coordinates[1]); 
        double deltaY = getYDiff(coordinates[0],coordinates[1]);

        for(int i = 2 ; i<coordinates.length; i++) {
            if(deltaY * getXDiff(coordinates[0], coordinates[i]) != deltaX * getYDiff(coordinates[0], coordinates[i])) {
                return false; 
            }
        }
       
       return true;  
    }
     
    private static double getXDiff(int p1[] , int p2[]) {
        return p2[0] - p1[0];
    } 
    private static double getYDiff(int p1[], int p2[]) {
        return p2[1] - p1[1]; 
    }

    public static void main(String[] args) {
   /*<aside>
💡 **Question 8**

You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

**Example 1:**

**Input:** coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]

**Output:** true

</aside> */ 

    int coordinates[][] = {{1,2} ,{2,3} , {3,4} , {4,5} , {5,6}, {6,7}}; 

    if(checkStraightLine(coordinates)) {
        System.out.println("The Given Coordinates forms a straight line");
    } else {System.out.println("The given coordinates do not form a straight line");}
    
    }
    
}
