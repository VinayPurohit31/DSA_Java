import java . util .*;
class Pattern{
    void p1(){
        System.out.println("Enter a No ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("=======================================");
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
}
class Main1{
    public static void main(String args[]){
        Pattern p=new Pattern();
        p.p1();
    }
}