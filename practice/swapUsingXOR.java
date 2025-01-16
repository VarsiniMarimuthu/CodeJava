//2 variable swap without any 3rd variable using XOR
class swapUsingXOR{
    public static void main(String[] args){
        int a=3,b=5;
        int c=(a^b)^a;
        int d=(a^b)^b;
        System.out.println("a:" +c);
        System.out.println("b:" +d);
    }
}