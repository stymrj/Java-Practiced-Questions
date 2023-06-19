package Functions;

public class CallByValue {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped Values Are");
        System.out.println("A is:"+a);
        System.out.println("B is:"+b);


    }



    public static void main(String[] args) {
    //swappping the vallue 
    int a = 5;
    int b = 10;
    /*swapping
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped Values Are");
        System.out.println("A is:"+a);
        System.out.println("B is:"+b); */
        System.out.println("Original A:"+a);
        System.out.println("Original :"+b);
        swap(a, b);  
    }
}
