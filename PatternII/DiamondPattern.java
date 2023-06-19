package PatternII;

public class DiamondPattern {
/*
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
        
 */

    public static void diamond_pattern(int n){
        // printing qst half of the diamond

        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            // stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half for printing the stars

        for(int i=n;i>=1;i--){
            // spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            // stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond_pattern(5);
    }
}
