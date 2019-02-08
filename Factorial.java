 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
       
        int a = 1;
        for(int i = 1;i <= value; i++){
        a = a * i;
    }
    return BigInteger.valueOf(a);
    }

}
