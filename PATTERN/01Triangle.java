import java . util .*;
class Pattern{
    void p1(){
        System.out.println("Enter a No ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int start=1;
        for (int i=0;i<n;i++){
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }
            for (int j=0;j<i;j++){
                System.out.print(start);
                start=1-start;
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