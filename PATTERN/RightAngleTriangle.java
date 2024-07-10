import java . util .*;
class Pattern{
    void p1(){
        System.out.println("Enter a No ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
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