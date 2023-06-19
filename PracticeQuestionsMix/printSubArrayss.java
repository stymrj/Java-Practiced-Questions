package PracticeQuestionsMix;

public class printSubArrayss {
    public static void print_subArrays(int number[]){
        int totalpairs =0;
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                totalpairs++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total pairs="+totalpairs);
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        print_subArrays(number);
    }
    
}
