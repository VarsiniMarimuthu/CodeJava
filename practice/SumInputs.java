//Find the sum of all input numbers entered
import java.util.Scanner;
class SumInputs{
    public static void main(String[] args){
        double n,sum=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers.Enter negative number to stop:");
        while(true){
            n=sc.nextDouble();
            if(n<0.0){
                break;
            }
            sum+=n;
        }
        System.out.println(sum);
    }
}