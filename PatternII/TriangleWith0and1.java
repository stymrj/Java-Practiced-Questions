package PatternII;

public class TriangleWith0and1 {
/*    one_zero_triangle
         1
         0 1
         1 0 1
         0 1 0 1
         1 0 1 0 1
 */

    public static void triangle_formed_with_0_1 (int n){
        // OUTER LINE 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){//inner loop--jitna line utna number print
                if((i+j)%2==0){//even nmbr
                    System.out.print("1");
                }
                else{//odd nmbr
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle_formed_with_0_1(5);
    }
    
}
