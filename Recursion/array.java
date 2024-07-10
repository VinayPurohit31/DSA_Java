import java.util.*;
class Arr{
    public static void main(String[]args){
       
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=sc.nextInt();

        int [][]arr=new int[s][s];
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
            System.out.println("Enter the value at "+i+" "+j+" Position");
            arr[i][j]=sc.nextInt();
            }
        }
        
       
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
            System.out.println("Value at "+i+" "+j+" Position is "+arr[i][j]);
            }
        }
        System.out.println("in matrix format");
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
            System.out.print(i+""+j+":"+arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}