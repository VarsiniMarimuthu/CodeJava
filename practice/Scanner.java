import java.util.Scanner;
class Scanner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your email id:");
        String email=sc.next();
        System.out.println("Enter the rating from 1 - 5");
        int rating=sc.nextInt();
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Email:" +email);
        System.out.println("You rated as:" +rating "Thank you for your feedback");
    }
}