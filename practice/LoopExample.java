//ExampleLoop
import java.util.Scanner;
class LoopExample{
    public static void main(String[] args){
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many starts do you want?");
        int n=sc.nextInt();
        while(i<=n){
            System.out.println("*");
            i++;
        }
    }
}