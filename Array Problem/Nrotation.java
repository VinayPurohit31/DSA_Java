
import java.util.Scanner;

class Nrotation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=1;
        int temp=0;
        int array[]={1,2,3,4,5,6};
        for(int i=0;i<array.length;i++){
            if(n!=0){
                temp=array[i];
                array[i]=array[array.length-t];
                array[array.length-t]=temp;
                n--;
                t++;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}