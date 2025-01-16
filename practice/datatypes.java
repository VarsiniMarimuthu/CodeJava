import java.util.Scanner;
class datatypes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your marks:");
        double marks=sc.nextDouble();
        System.out.println("Enter your grade:");
        char grade=sc.next().charAt(0);
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Marks:" +marks);
        System.out.println("Grade:" +grade);
    }
}