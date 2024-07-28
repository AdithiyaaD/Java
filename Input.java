import java.util.Scanner;
public class Input{
public static void main(String[] args)
{
Scanner myobj=new Scanner(System.in);
String name;
int age;
int salary;
System.out.println("Enter your name: ");
name=myobj.nextLine();
System.out.println("Enter your age: ");
age=myobj.nextInt();
System.out.println("Enter your salary: ");
salary=myobj.nextInt();
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Salary: "+salary);
}
}
