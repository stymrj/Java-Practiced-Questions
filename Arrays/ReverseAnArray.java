package Arrays;

public class ReverseAnArray {
    public static void reverseArray(int number[]){
        int first =0, last=number.length-1;
        while(first<last){
            // swap 
            int temp = number[last];
            number[last]=number[first];
            number[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12};

        reverseArray(numbers);
        // for printing values
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");

        }
        System.out.println();
    }
    
}

