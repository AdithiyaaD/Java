import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.printf("Enter the start of the range: \n");
        int low=myobj.nextInt();
        System.out.printf("Enter the end of the range: \n");
        int high=myobj.nextInt();
        int sum,i;
        String istring;
        char arr[];
        System.out.printf("The armstrong numbers in the given range are ");
        for(i=low;i<high+1;i++){
            sum=0;
            istring=String.valueOf(i);
            arr=istring.toCharArray();
            for(char k: arr){
                int data= Character.getNumericValue(k);
                sum+=data*data*data;
            }
            if(sum==i){
                System.out.printf("%d ",i);
            }
        } 
    }
}
