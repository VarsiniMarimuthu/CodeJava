//Overloading constructor
class method{
    int length, breadth, height;
    method(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    method(int side){
        length=side;
        breadth=side;
        height=side;
    }
    method(){
        length=1;
        breadth=2;
        height=3;
    }
    int volume(){
        return length*breadth*height;
    }
}
    class Practice{
    public static void main(String[] args){
        method b1=new method(2,3,4);
        int a=b1.volume();
        System.out.println(a);

        method b2=new method(2);
        int b=b2.volume();
        System.out.println(b);

        method b3=new method();
        int c=b3.volume();
        System.out.println(c);
    }
}
