import java.util.Scanner;
class pyramid{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("     " +  num);
        System.out.println("    " +  num + " " + num);
        System.out.println("   " +  num + " " + num + " " + num);
        System.out.println("  " +  num + " " + num + " " + num + " " + num);
        System.out.println(" " +  num + " " + num + " " + num + " " + num + " " + num);
        System.out.println(num + " " + num + " " + num + " " + num + " " + num + " " + num);
    }
}