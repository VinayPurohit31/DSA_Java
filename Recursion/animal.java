class Animal{
    void zoo(int l){
        if (l==2){
            int n=3;
            System.out.println("total Animals are : "+n+" Of Two legs");

        }
        else if(l==4){
            int n=5;
            System.out.println("total Animals are : "+n+" Of Four legs");
        }
        else{
            System.out.println("No Animals are :Of "+l+" legs");
        }
    }
    public static void main(String[] args) {
        Animal a=new Animal();
        a.zoo(4);
    }
}