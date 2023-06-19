package Patterns;

public class InvertedLinePattern {
    public static void main(String[] args) {
        /*
             ******
             ****
             ***
             **
             *
         */
            for(int i =1;i<=58;i++){
                for(int j=1;j<=58-i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }


    }
    
}
