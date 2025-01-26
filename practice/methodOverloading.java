//Method overloading
class Practice{
    static void test(){
        System.out.println("Test method with no argument");
    }
    static void test2(int a){
        System.out.println("Test method with 1 argument");
    }
    static void test3(int a, int b){
        System.out.println("Test method with 2 argument");
    }
    public static void main(String[] args){
        test();
        test2(7);
        test3(3,4);
    }
}