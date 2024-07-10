import java . util .*;
class Pattern{
    void p1(){
        System.out.println("Enter a No ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("=======================================");
        for (int i=0;i<n;i++){

            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print(" ");
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