import java.util.*;
class swap{
    void reSwap(int i,int n,int[] array){
       if( i==n/2) 
       {
        return ;
       }
       int temp=array[i];
       array[i]=array[n-i-1];
       array[n-i-1]=temp;
    //    Array.swap(array[i],arr[n-i-1]);
       reSwap(i+1,n,array);
    }
    public static void main(String []args){
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        swap s=new swap();
        s.reSwap(0,n,array);
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
            
        }

    }
}