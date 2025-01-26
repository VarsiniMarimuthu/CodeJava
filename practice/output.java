class output{
    public static void main(String[] args){
        int a=3,b=4,c;
        c= a + b + a++ + b++ + ++a + ++b;
        System.out.println("a:" +a);
        System.out.println("b:" +b);
        System.out.println("c:" +c);
    }
}