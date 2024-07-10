class Name{
    int count=0;
    void logic(int i,int n){
        if (i<n){
            System.out.println("count= "+count);
            return;
           
        }
        System.out.print(i);
        System.out.print(" ");
        count=i+count;
        
        i--;
        logic(i,n);
        
    }
    public static void main(String[]args){
        Name n=new Name();
        n.logic(5,1);

    }


}