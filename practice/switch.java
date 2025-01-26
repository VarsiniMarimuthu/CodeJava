//Switch statement
import java.util.Scanner;
class switch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1:");
        int a=sc.nextInt();
        System.out.println("Enter the num2:");
        int b=sc.nextInt();
        System.out.println("Enter the Operator");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println("a" + "+" + "b" + "="  +(a+b));
            break;
            case '-':
            System.out.println("a" + "-" + "b" + "="  +(a-b));
            break;
            case '*':
            System.out.println("a" + "*" + "b" + "="  +(a*b));
            break;
            case '/':
            System.out.println("a" + "/" + "b" + "="  +(a/b));
            break;
            case '%':
            System.out.println("a" + "%" + "b" + "="  +(a%b));
            break;
            default:
            System.out.println("You have entered invalid operator");
        }
    }
}