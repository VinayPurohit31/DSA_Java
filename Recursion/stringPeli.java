class Vinay{
    boolean show(int i,String s)
    {
        if(i>=s.length()/2) {
            return true;}
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
        {

         return false;
        }
         return show(i+1,s);
       
        

    }
    public static void main(String[] args) {
        String s= "HeH";
        Vinay v=new Vinay();
        v.show(0,s);
        boolean result = v.show(0, s);
        System.out.println(result ? "Palindrome" : "Not a Palindrome");
        
    }
}