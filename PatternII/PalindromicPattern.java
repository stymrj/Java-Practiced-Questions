package PatternII;

public class PalindromicPattern {
/*
        1
       212
      32123
     4321234
    543212345
 */
    public static void palindromic_patttern (int n){
        //outer loop 
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // numbers - first decending from i to 1;
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // numbers - then asscending from 2 to i;
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindromic_patttern(9);
    }
    
}
