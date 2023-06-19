package ContionalStatements;

public class TernaryOperators {
    public static void main(String[] args) {
    // Checking wheter EVEN or ODD ??
    int num = 7;
    String type=(num%2==0)?"Even":"Odd";
    System.out.println(type);

    // Ternary Operator for checking PAss or FAIL
    int num2 = 12;
    String Status= (num2>=33)?"PASS":"FAIL";
    System.out.println(Status);
    }
}
