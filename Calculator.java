import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        while(true){
            System.out.println("1 for Addition");
            System.out.println("2 for Subtraction");
            System.out.println("3 for Multiplication");
            System.out.println("4 for Division");
            System.out.println("5 for Modulus");
            System.out.println("6 to Exit");
            System.out.println("Enter your choice from the list below");
            int choice = myobj.nextInt();
            if(choice==6){
                break;
            }
            if(choice!=1&&choice!=2&&choice!=3&&choice!=4&&choice!=5&&choice!=6){
                System.out.println("The entered choice is invalid");
                continue;
            }
            System.out.println("Enter number 1:");
            float num1 = myobj.nextFloat();
            System.out.println("Enter number 2:");
            float num2 = myobj.nextFloat();
            float num3;
            switch(choice){
                case 1:
                num3=num1+num2;
                System.out.println("The addition of two numbers is "+num3);
                break;
                case 2:
                num3=num1-num2;
                System.out.println("The subtraction of two numbers is "+num3);
                break;
                case 3:
                num3=num1*num2;
                System.out.println("The multiplication of two numbers is "+num3);
                break;
                case 4:
                num3=num1/num2;
                System.out.println("The division of two numbers is "+num3);
                break;
                case 5:
                num3=num1%num2;
                System.out.println("The modulus of two numbers is "+num3);
                break;
                default:
                System.out.println("The entered choice is invalid");
                continue;
            }
        }
    }
}