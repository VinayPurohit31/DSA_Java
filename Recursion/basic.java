class Heel{
    int count=0;
     void gg(){
       
        if(count==2){
        return;
      }
      System.out.println("heel");
      count++;
        gg();
     }
}
class Main1{
    public static void main(String[] args) {
        Heel h = new Heel();
        h.gg();
    }
}