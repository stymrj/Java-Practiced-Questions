package PatternII;

public class NumberPyramid {
/*
        1  
      2  2
    3  3  3
  4  4  4  4
 5  5  5  5  5   

 */
    public static void number_pyramid(int n){
    // outer loops
       for(int i=1;i<=n;i++){
        // spaces 
         for(int j=1;j<=n-i;j++){ // inner loops
            System.out.print("  ");
         }
         // stars
         for(int j=1;j<=i;j++){
            System.out.print(i+"  ");
         }
         System.out.println();
       }
    }
    public static void main(String[] args) {
        number_pyramid(9);
    }
    
}
