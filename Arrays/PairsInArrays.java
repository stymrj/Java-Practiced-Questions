package Arrays;

public class PairsInArrays {
    public static void printPairs( int number[]){
        int totalpairs =0;
        for(int i=0;i<number.length;i++){ 
            int current = number[i]; // 2,3,4,5,6,7
            for(int j=i+1;j<number.length;j++){ // for second nmbr in each pairs 
                System.out.print("("+current+","+number[j]+") ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs= "+totalpairs);
    }
    
    public static void main(String[] args) {
        int number[]={2,3,4,5,6,7};
        printPairs(number); 
    }
}

/* OUTPUT: 
 * (2,3) (2,4) (2,5) (2,6) (2,7) 
   (3,4) (3,5) (3,6) (3,7) 
   (4,5) (4,6) (4,7) 
   (5,6) (5,7) 
   (6,7)

    total pairs= 15
 */

