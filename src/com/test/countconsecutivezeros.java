package com.test;
public class countconsecutivezeros{
    public static void main(String[] Args){
        int number = 40040001;  // whatever the number is
        System.out.println(consecutivezeros(number, 1)); 
    }

    public static int consecutivezeros(int number, int max){
        if (number != 0){        
        if (max < zerosfrompoint(number)) max = zerosfrompoint(number);
            return consecutivezeros(number/10, max);            
        }
        return max;
    }

    public static int zerosfrompoint(int number){
        int zeros = 0;
        if ((number != 0) && ((number/10)*10 == number)){ 
            zeros++;
            System.out.println(zeros);
            return zeros + zerosfrompoint(number/10);
        }
        return zeros;
    }  
}