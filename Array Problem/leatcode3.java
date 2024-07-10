class leatcode3{
    public static void main(String[] args) {
    int digits[]={9};
    int t=0;
       for(int i=0;i<digits.length;i++){
            int d=digits[i];
            t=(t*10)+d;
       } 
       System.out.println(t);
       int it=t+1;
       System.out.println(it);
       for(int i=0;i<digits.length;i++){
              int td=it%10;
             it=it/10;
             digits[digits.length-i-1]=td;
             System.out.print(digits[i]);
       }

    }
    }
