//Access control
class stack{
    //data should be private ,and methods should be public 
    private int s[]=new int[10];
    private int tos; //top of stack
    stack(){
        tos=-1;
    }
    void push(int item){
        if(tos==s.length){
            System.out.println("Stack is full");
        }
        else{
            s[++tos]=item;
        }
    }
        int pop(){
            if(tos>=0)
            return s[tos--];
            else
            System.out.println("Stack is empty");
            return -1;
        }
    }
class Practice{
    public static void main(String[] args){
        stack s1=new stack();
        s1.push(5);
        s1.push(6);
        s1.push(9);
        s1.s[7]=100;
        System.out.println(s1.pop());
    }
}