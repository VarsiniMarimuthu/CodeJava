import java.util.Arrays;
class student{
    String name;
    int rollno;
    int marks[]=new int[5];
    int marksTotal(){
        return marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
    }
}
class Practice{
    public static void main(String[] args){
        student s1=new student();
        s1.name="Raj";
        s1.rollno=21;
        s1.marks[0]=98;
        s1.marks[1]=88;
        s1.marks[2]=93;
        s1.marks[3]=91;
        s1.marks[4]=85;
        System.out.println("Name:" +s1.name);
        System.out.println("Roll No:" +s1.rollno);
        System.out.println("Marks:" +Arrays.toString(s1.marks));
        System.out.println("Total:" +s1.marksTotal());
        student s2=new student();
        s2.name="Ram";
        s2.rollno=21;
        s2.marks[0]=90;
        s2.marks[1]=89;
        s2.marks[2]=97;
        s2.marks[3]=99;
        s2.marks[4]=81;
        System.out.println("Name:" +s2.name);
        System.out.println("Roll No:" +s2.rollno);
        System.out.println("Marks:" +Arrays.toString(s2.marks));
        System.out.println("Total:" +s2.marksTotal());
    }
}