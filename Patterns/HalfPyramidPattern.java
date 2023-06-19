package Patterns;

public class HalfPyramidPattern {
    public static void main(String[] args) {
/*
            1
            12
            123
            1234
            12345
            123456
 */
         for(int i =1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
         }

/*
            1
            22
            333
            4444
            55555
            666666
 */
         for(int line=1;line<=6;line++){
            for(int num =1;num<=line;num++){
                System.out.print(line);
            }
            System.out.println();
         }



    }
    
}
