package Arrays;

public class arrayBasics {
    // updating the marks by adding 5 to them

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+5;
        }
    }
    public static void main(String[] args) {
        int marks[]={85,69,75,28,69};
        update(marks);
        // print the updated marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] +" ");
        }
        System.out.println();
    }
}
