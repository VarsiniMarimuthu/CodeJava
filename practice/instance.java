//Instance variable
class instance{
    int l;
    int b;
    int h;
    int volume(){
        return l*b*h;
    }
}
class Practice{
    public static void main(String[] args){
        instance box1=new instance();
        box1.l=2;
        box1.b=3;
        box1.h=4;
        int a=box1.volume();
        System.out.println(a);
        instance box2=new instance();
        box2.l=4;
        box2.b=5;
        box2.h=6;
        int b=box2.volume();
        System.out.println(b);
    }
}

//Add area method to instance class
class instance{
    int l;
    int b;
    int h;
    int a;
    int volume(){
        return l*b*h;
    }
    int surfaceArea(){
        return a*a;
    }
}
class Practice{
    public static void main(String[] args){
        instance box1=new instance();
        box1.l=2;
        box1.b=3;
        box1.h=4;
        box1.a=7;
        int a=box1.volume();
        int a2=box1.surfaceArea();
        System.out.println("Volume of box1:" +a);
        System.out.println("Area of box1:" +a2);
        instance box2=new instance();
        box2.l=4;
        box2.b=5;
        box2.h=6;
        box2.a=9;
        int b=box2.volume();
        int b2=box2.surfaceArea();
        System.out.println("Volume of box2:" +b);
        System.out.println("Area of box2:" +b2);
    }
}