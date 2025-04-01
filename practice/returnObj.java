class Box{
    int length;
    int breadth;
    int height;
    Box(int l,int h,int b){
        length=l;
        breadth=b;
        height=h;
    }
    Box doubleBox(){
        Box temp=new Box(2*length,2*height,2*breadth);
        return temp;
    }
}
class Practice{
    public static void main(String[] args){
        Box b1=new Box(5,3,4);
        Box b2=new Box(5,3,4);
        Box b3=b1.doubleBox();
        System.out.println(b3.length);
        System.out.println(b3.height);
        System.out.println(b3.breadth);
    }
}