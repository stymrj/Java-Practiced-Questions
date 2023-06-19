package PatternII;

public class halfPyramidwithNumbers {
/*
 *  1 2 3 4 5
 *  1 2 3 4
 *  1 2 3
 *  1 2
 *  1
*/

    public static void half_pyramid_withNumber(int n){
        // outer line
        for(int i=1;i<=n;i++){
        // inner line for numbers 
           for(int j=1;j<=n-i+1;j++){ //n-i+1 for getting the numbers upto last range like 5,4,3..
             System.out.print(j);
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        half_pyramid_withNumber(8);
    }
    
}
