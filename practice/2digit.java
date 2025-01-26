//write a method check if the number is 2 digit & return boolean value
class Practice{
    static boolean digit(int num){
        if(num>=10 && num<=99){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean result=digit(87);
        if(result){
            System.out.println("2 digit number");
        }
        else{
            System.out.println( "Not a 2 digit number");
        }
    }
}