  
//import java.util.lang.*;

public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int num1 = integers[0];
        int num2 = integers[1];
        int num3 = integers[2];
        int res = 0;
        int[] myArray = new int[3];
        if( num1 > num2 ){
            if(num1 > num3 ){
                res = num1;
            }
            else{
                res = num3;
            }
        }
        else{
            res = num2; 
        }
        return res;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int res1 = Math.max(integers[0], integers[1]);
        res1 = Math.max(integers[2], res1);
        return res1;
    }
}
