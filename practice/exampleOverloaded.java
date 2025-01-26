//Overloaded method example
class Student{
    int rollno;
    String name;
    int[] marks;
    Student(){
        rollno=33;
        name="Ram";
        marks=new int[]{87,90,97,78,98};
    }
    Student(int r,String n,int...m){
        rollno=r;
        name=n;
        marks=m;
    }
    int total(){
        System.out.println("Roll No:" +rollno);
        System.out.println("Name:" +name);
        int totalMarks=0;
        for(int i=0;i<marks.length;i++){
            totalMarks+=marks[i];
        }
        return totalMarks;
    }
}
class Practice{
    public static void main(String[] args){
        Student s1=new Student();
        int a=s1.total();
        System.out.println(a);
        Student s2=new Student(3,"Raju",78,84,73,82,91);
        int b=s2.total();
        System.out.println(b);
    }
}