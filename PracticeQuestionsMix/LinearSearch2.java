package PracticeQuestionsMix;

public class LinearSearch2 {
    public static int linearSearch(int number[], int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,4,5,77,8,12,43,64,32};
        int key = 12;

        int index = linearSearch(number, key);
        if(index == -1){
            System.out.println("Key Not Found");
        }else{
            System.out.println("Number is"+i);
        }
    }
    
}
