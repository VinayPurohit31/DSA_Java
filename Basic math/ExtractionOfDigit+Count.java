import java . util .*;
import java . io.*;
import java . util.*;
import static java . lang . Math . log10;


class Pattern{
    void p1(){
        System.out.println("Enter a No ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int og=n;
        //with the help of log function to count no of digits
        int count=(int)(log10(n)+1);
        System.out.println("No of digits are "+count); 

        System.out.println("No of digits are "+count);
        int revrse=0;
        //printing digit in reverse order
        int sum = 0;
        System.out.println("Print digit in revrse order: ");
        while(n>0){
            int m=n%10;
            n=n/10;
            sum = sum+(m*m*m);
            revrse=(revrse*10)+m;

        }
        System.out.println(revrse);
    
        // checking for palindrom no
        System.out.println("Checking for palindrom no: ");
        if (revrse==og){
           
            System.out.println(revrse==og);
        }
        else{   
            System.out.println(revrse==og);

        }
        System.out.println("Checking if it is a amgstrong  no: ");
        if (sum==og){
           
            System.out.println(sum==og);
        }
        else{  
            System.out.println(sum==og);

        }
        
        System.out.println("Printing all the divisor of "+og);
        for (int i=1;i<=og;i++){
            if(og%i==0){
                System.out.print(i+",");
            }
        }
    }

}
class Main1{
    public static void main(String args[]){
        Pattern p=new Pattern();
        p.p1();
    }
}