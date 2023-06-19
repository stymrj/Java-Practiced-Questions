package Arrays;

public class MaxSubArraySum {
    public static void maxSubArrays(int numbers[]){
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    //System.out.print(numbers[k]+" ");
                    // subArraySum
                    currSum += numbers[k];
                }
                System.out.print(currSum+" ");
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum: "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        maxSubArrays(numbers);
    }
    
}
