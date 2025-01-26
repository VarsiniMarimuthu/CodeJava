class sumOfDigits{
    static int sum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        int a=sum(223);
        int b=sum(566);
        int c=sum(874);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

//Sum of digits that keep on adding until it become single digit
class Practice{
    static int sumOfDigits(int num){
        while(num>=10){
            int sum=0;
            while(num>0){
            sum+=num%10;
            num/=10;
            }
            num=sum;
        }
        return num;
    }
    public static void main(String[] args){
        int a=sumOfDigits(223);
        int b=sumOfDigits(566);
        int c=sumOfDigits(874);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}