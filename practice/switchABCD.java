import java.util.Scanner;
class switchABCD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Alphabet:");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'a','e','i','o','u' :
            System.out.println("It is a vowel");
            break;
            case 'b': case 'c': case 'd': case 'f': case 'g':
            case 'h': case 'j': case 'k': case 'l': case 'm':
            case 'n': case 'p': case 'q': case 'r': case 's':
            case 't': case 'v': case 'w': case 'x': case 'y': case 'z': 
            System.out.println("It is a consonant");
            break;
            default:
            System.out.println("You have entered an incorrect letter");
        }
    }
}