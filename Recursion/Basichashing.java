import java.util.Scanner;
class Hash{
    static int []hashi=new int[100000];
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[]array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            hashi[array[i]]++;
        }
    
        System.out.println("Enter the total element of arrays you want to search");
        int g=sc.nextInt();
        
        while(g!=0){
            int no=sc.nextInt();
            System.out.println(hashi[no]);
            g--;
        }
        
    }
}