package Arrays;

public class printSubArrays {
    public static void print_subArrays( int number[]){
        int totalSubArrays=0;
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                for(int k= start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Toyal SubArrays = "+totalSubArrays);
    }

    public static void main(String[] args) {
        int number[]={2,3,4,5,6,7,8};
        print_subArrays(number);
    }
    
}
