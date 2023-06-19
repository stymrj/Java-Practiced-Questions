package Loops2;

public class BreakStatements {
    public static void main(String[] args) {
        // used to terminate from any loops
        for(int i=1;i<=10;i++){
            if( i == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of loops");

    }
}
