package Arrays;

public class BinarySearch {
    public static int binary_search(int number[],int key){ //arguments
        int start=0, end = number.length-1;
        while(start<=end){ // array size chota hota jayee
            int mid = (start + end) /2;
            // comparison 
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){ //right
                start= mid +1;
            }else{ // left 
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[]={5,8,9,12,36,7,56,24,48};
        int key = 9;
        System.out.println("index for key is:"+binary_search(number, key));
    }
}
