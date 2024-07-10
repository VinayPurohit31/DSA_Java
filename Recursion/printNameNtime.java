class Name{
    void logic(int i,String n){
        if (i==0){
            return;
           
        }
        System.out.println("Hello "+n);
        i--;
        logic(i,n);
    }
    public static void main(String[]args){
        Name n=new Name();
        n.logic(5,"vinay");

    }


}