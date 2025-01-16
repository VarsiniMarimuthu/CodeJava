class InnerOuter{
    public static void main(String[] args){
        outer:
        for(int i=1;i<=5;i++){
            inner:
            for(int j=1;j<=i;j++){
                if(i==4&&j==4)
                continue outer;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}