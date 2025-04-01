//Static variable and static methods
class Box{
    int length;
    int breadth;
    int height;
    static int boxCount;
    Box(int l,int h,int b){
        length=l;
        breadth=b;
        height=h;
        boxCount++;
    }
    Box(){
        length=-1;
        breadth=-1;
        height=-1;
        boxCount++;
    }
    static{
        System.out.println("From the static block");
        boxCount=0;
    }
    Box(int l){
        length=breadth=height=1;
        boxCount++;
    }
    Box(Box b){
        length=b.length;
        height=b.height;
        breadth=b.breadth;
        boxCount++;
    }
    void setDim(int l,int b,int h){
        length=l;
        height=h;
        breadth=b;
    }
    int volume(){
        return length*breadth*height;
    }
    boolean isEqual(Box b){
        if(length==b.length && breadth==b.breadth && height==b.height)
        return true;
        return false;
    }
    static void displayBoxCount(){
        System.out.println("Box count is:" + boxCount);
    }
}
class Practice{
    public static void main(String[] args){
        System.out.println("Main method satrts here...");
        Box blackBox;
        System.out.println("Before creating box obj");
        blackBox=new Box(5,4,3);
        System.out.println("After creating box obj");
        blackBox.setDim(6,4,3);
        System.out.println("Vol of black box:" +blackBox.volume());
        Box woodBox=new Box(30,24,25);
        System.out.println("Vol of wood box:" +woodBox.volume());
        woodBox.setDim(56,45,23);
        Box b1=new Box(6,5,3);
        System.out.println("Blackbox==b1" +blackBox.isEqual(b1));
        Box b2=new Box(b1);
        System.out.println(Box.boxCount);
    }
}
/* Output:
 Main method satrts here...
Before creating box obj
From the static block
After creating box obj
Vol of black box:72
Vol of wood box:18000
Blackbox==b1false
4
 */