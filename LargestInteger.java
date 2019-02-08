

import java.util.Scanner;

public class LargestInteger {
    
    public static void main(String[] args){
        
    }
    

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        
        if(integers[0] > integers[1] && integers[0] > integers[2]){
            return integers[0];
        }
        else if (integers[1] > integers[0] && integers[1] > integers[2]){
            return integers[1];
        }
        else {
            return integers[3];
        }
        
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        
        int largest = Math.max(integers[0],integers[1]);
        
        largest = Math.max(integers[2],largest);
        
        return largest;
        
        
        
        
        
       
    }

}
