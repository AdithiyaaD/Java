import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
    Scanner myobj=new Scanner(System.in);
    System.out.printf("Enter number of rows and columns: \n");
    int x=myobj.nextInt();
        for(int i=0;i<x;i++){
            if(i==0||i==x-1){
                for(int j=0;j<x;j++){
                    System.out.printf("* ");
                }
                System.out.printf("\n");
            }
            else{
                System.out.printf("* ");
                for(int j=1;j<x-1;j++){
                    System.out.printf("  ");
                }
                System.out.printf("* \n");
            }
        }
    }
}
