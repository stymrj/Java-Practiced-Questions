package PatternII;

public class FloydTrianglePattern {
/*
 *  1 
 *  2  3
 *  4  5  6
 *  7  8  9  10
 *  11 12 13 14 15
 */
    public static void floydTraingle(int n){
        // outer line 
    int counter =1;
        for(int i=1;i<=n;i++){ // outer line 
            for(int j=1;j<=i;j++){ // j<=i bcz har line me same equal print ho rha line utna number
                System.out.print(counter+" ");
                counter++; // increase every time
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydTraingle(5);
        
    }
    
}
