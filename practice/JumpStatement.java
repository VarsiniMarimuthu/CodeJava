//Jump statements
//For a given n , Find the nearest number that is divisible by 10, that is less than or equal to n
import java.util.Scanner;
class JumpStatement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        while(n>=0){
            if(n%10==0){
            System.out.println(n);
            break;
            }
            n--;
        }
    }
}