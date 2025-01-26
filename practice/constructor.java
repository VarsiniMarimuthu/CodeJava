//Constructor
class instance{
    int length,breadth,height;
    instance(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    int volume(){
        return length*breadth*height;
    }
}
class Practice{
    public static void main(String[] args){
        instance box1=new instance(2,3,4);
        int a=box1.volume();
        System.out.println(a);
        instance box2=new instance(5,5,6);
        int b=box2.volume();
        System.out.println(b);
    }
}