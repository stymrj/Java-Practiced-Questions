package PatternII;

public class InvertedRotatedHalfPyramid {
/*  --Inverted & Rotated Half-Pyramid
                *
               **
              ***
             ****
            *****
*/
    public static void half_pyramid(int n){
        for(int i=1;i<=n;i++){ // apne line ko print kiye
            for(int j=1;j<=n-i;j++){ // apne space ko print kiya 
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){ // star print kiye star=Row number
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_pyramid(10);
        
    }
    
}
