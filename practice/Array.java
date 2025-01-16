//Arrays
class Array{
    public static void main(String[] args){
        //1-D array
        int arr[]=new int[6];
        arr[0]=87;
        arr[1]=98;
        arr[3]=56;
        System.out.println(arr[1]);
        int arr2[]={34,65,87,76,89};
        System.out.println(arr2[3]);
        //2-D array
        int ar[][]=new int[2][3];
        ar[2][3]=87;
        ar[1][3]=98;
        ar[3][1]=56;
        System.out.println(ar[2][3]);
        int ar2[][]={
        {34,65,87,76,89},
        {45,62,12,25,55}
        };
        System.out.println(ar2[2][4]);
    }
}