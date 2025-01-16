class TypeCasting{
    public static void main(String[] args){
        /*
        byte b=5;
        int a;//implicit type conversion
        a=b;// automatic type conversion
        System.out.println(a);
        */

        /*
        int n=10;
        byte b;
        b=n; // incompatible types: possible lossy conversion from int to byte
        System.out.println(b);
        */

        int n=10;
        byte b;
        b=(byte)n; //explicit type conversion
        System.out.println(b);
    }
}