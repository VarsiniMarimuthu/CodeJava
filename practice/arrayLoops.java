//Handling array using loops
import java.util.Scanner;
class arrayLoops{
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        System.out.println("Enter the 6 numbers:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
            for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            }
        }
    }