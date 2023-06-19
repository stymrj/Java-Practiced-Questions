package PatternII;

public class HollowRectangle {
/*
 *             **********
 *             *        *
 *             *        *
 *             *        *
 *             *        *
 *             *        *
 *             **********
 */

    public static void hollow_rectangle(int totRows, int totColmn){
        // outer loop
        for(int i = 1; i<=totRows;i++){
            // inner loop
            for(int j=1; j<=totColmn;j++){
            // here we see that stars are only at boundary so we will write this condtition 
                if(i ==1||i==totRows||j==1||j==totColmn){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        hollow_rectangle(4, 8);
    }
    
}
