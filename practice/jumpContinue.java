//Jump continue
class jumpContinue{
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            if(i==8) //It will not print 8
            continue; //It will skip the loop,go back and do the next iteration
            System.out.println(i);
        }
    }
}