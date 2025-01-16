//Loops
class loops{
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            System.out.println("*");
        }
        //System.out.println(i); i Cant access outside the loop, because i is initialised inside the loop

        //while loop
        int j=4;
        while(j<=5){
            System.out.println(j);
            j++;
        }

        //do while loop
        int k=3;
        do{
            System.out.println(k);
            k++;
        }while(k<=5);
    }
}