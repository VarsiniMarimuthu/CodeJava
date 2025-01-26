//methods
//with return type
class Practice{
    static int boxVol(int l,int b,int h){
        int vol=l*b*h;
        return vol;
    }
    public static void main(String[] args){
        int volume=boxVol(2,3,6);
        System.out.println(volume);
    }
}
//without return type
class Practice{
    static void boxVol(int l,int b,int h){
        int vol=l*b*h;
        System.out.println(vol);
    }
    static void printline(){
        System.out.println("__________________________");
    }
    public static void main(String[] args){
        printline();
        boxVol(2,3,6);
        printline();
    }
}