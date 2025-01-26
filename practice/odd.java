//Print odd numbers based on input
import java.util.Scanner;
class odd{
    public static void main(String[] args){
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        while(i<=n){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}

//Print first n odd numbers
import java.util.Scanner;
class odd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=0;
        int num=1;
        while(count<n){
            System.out.println(num);
            num+=2;
            count++;
        }
    }
}