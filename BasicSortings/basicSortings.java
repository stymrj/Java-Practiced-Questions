package BasicSortings;

public class basicSortings {
    public static void bubbleSort(int numbers[]) {
        for(int turn=0;turn<numbers.length-1;turn++){ // outer loop 
            for(int j=0;j<numbers.length-1-turn;j++){ 
                if(numbers[j] > numbers[j+1]){
                    //swap
                   int temp= numbers[j];
                   numbers[j]=numbers[j+1];
                   numbers[j+1]=temp;
                }
            }
        } 
    }

    public static void printArray(int numbers[]) {
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        } 
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,8,2,9,6,0,7};
        bubbleSort(numbers);
        printArray(numbers);
    }
    
}
