package Loops2;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i=1; i<=10;i++){
            if(i == 4){
                continue;  // used for skipping the iteration 
            }
            System.out.println(i );
        }
    }
}