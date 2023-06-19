package Arrays;
import java.util.*;

public class LargestNumber {
    public static int getLargest(int number[]){
        int largestNumber = Integer.MIN_VALUE; // minus infinity
        int smallestNumber = Integer.MAX_VALUE; // plus infinity

        for(int i=0;i<number.length;i++){
            if(largestNumber < number[i]){
                largestNumber=number[i]; // updated the largest number
            }
            if(smallestNumber > number[i]){
                smallestNumber = number[i]; // updated to smallest
            }
        }
        System.out.println("the smallest value is:"+smallestNumber);
        return largestNumber;   
    }
    public static void main(String[] args) {
        int number[]={5,98,45,75,66,2,35,12,34,18};
       System.out.println("the largest value is: "+getLargest(number));
    }
    
}


