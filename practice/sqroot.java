//Nearest perfect square number greater than n
import java.util.Scanner;
class sqroot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        // Find the next integer greater than the square root of n
        int nextRoot = (int)Math.sqrt(n) + 1;

        // Calculate the perfect square of this integer
        int nearestPerfectSquare = nextRoot * nextRoot;
        System.out.println("The nearest perfect square number greater than " + n + " is: " + nearestPerfectSquare);
        }
    }