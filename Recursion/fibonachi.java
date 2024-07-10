import java.util.Scanner;
class Void{
    int clas(int n){
        if (n<=1)
        { return n;}
        int l=clas(n-1);
        int ls=clas(n-2);
        return l+ls;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Void m=new Void();
       int re= m.clas(n);
        System.out.print(re);
    }
}