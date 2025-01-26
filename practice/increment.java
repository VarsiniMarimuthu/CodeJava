class increment{
    public static void main(String[] args){
        int a = 10;
        int c=a++; //Post increment
        System.out.println("a:" +a);
        System.out.println("c:" +c);

        int a = 10;
        int c=++a; //Pre increment
        System.out.println("a:" +a);
        System.out.println("c:" +c);
    }
}