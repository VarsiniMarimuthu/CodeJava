//overloaded methods to find average of 2 or 3 numbers
class average{
    int avg;
    average(int n1,int n2,int n3){
        avg=n1+n2+n3/3;
    }
    average(int n1,int n2){
        avg=n1+n2/2;
    }
    void total(){
        System.out.println(avg);
    }
}
class Practice{
    public static void main(String[] args){
        average ex1=new average(98,97,92);
        ex1.total();
        average ex2=new average(88,99);
        ex2.total();
    }
}