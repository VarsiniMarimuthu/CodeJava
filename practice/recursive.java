class Practice{
    public static void main(String[] args){
        int n=5;
        System.out.println(fact(n));
    }
    static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
}
//_____________________________

class Practice{
    public static void main(String[] args){
        int n=20;
        System.out.println(fibonnaci(n));
    }
    static int fibonnaci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonnaci(n-1)+fibonnaci(n-2); 
    }
}