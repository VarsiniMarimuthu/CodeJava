//Print all numbers less than 100 except numbers divisible by both 4 and 6 by using continue
class continueEx2{
    public static void main(String[] args){
        for(int i=1;i<100;i++){
            if(i%4==0 && i%6==0){
                continue;
                //System.out.println(i);
            }
            System.out.println(i);
            
        }
    }
}