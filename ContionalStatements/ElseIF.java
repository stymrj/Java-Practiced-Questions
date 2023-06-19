package ContionalStatements;

public class ElseIF {
    public static void main(String[] args) {
        int age = 73;
        if(age>=18){
            System.out.println("Adult");
        }
        else if(age >= 13 && age <= 13){
            System.out.println("Teenagers");
        }else{
            System.out.println("Children");
        }
    }
    
}
