package Arrays;

public class LinearSearch {
    public static int linear_search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1; // key doesnt exist
    }
    public static void main(String[] args) {
        int numbers[]={5,4,58,45,9,12,78,36,75};
        int key=12;
 
        int index=linear_search(numbers, key);
        if(index == -1){
            System.out.println("Not Found!");
        }
        else{
            System.out.println("Key is at "+index);
        }
    }
    
}
