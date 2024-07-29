import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.printf("Enter number 1: \n");
        int x=myobj.nextInt();
        System.out.printf("Enter number 2: \n");
        int y=myobj.nextInt();
        int ans=(x>y)?x:y;
        while (true) { 
            if(ans%x==0&&ans%y==0)
            break;
            ans++;
        }
        System.out.printf("The LCM of the two inputs are %d",ans);
    }
}
