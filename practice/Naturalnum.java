//Find the sum of first n natural numbers
import java.util.Scanner;
class Naturalnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=1;
        int sum=0;
        while(count<=n){
            sum+=count;
            count++;
        }
        System.out.println(sum);
    }
}

//To calculate without using loop 
int sum =n * (n+1)/2; // Calculate sum using the formula
System.out.println(sum);