//Factorial of n
import java.util.Scanner;
class Practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=1;
        int mul=1;
        while(count<=n){
            mul*=count;
            count++;
        }
        System.out.println(mul);
    }
}