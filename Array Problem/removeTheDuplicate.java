
import java.util.*;
class removeTheDuplicate{
    public static void main(String[] args) {
    int array[]={1,1,2,2,3,4,4,3,5,5};
    Set<Integer> no=new HashSet<>();
    for(int i=0;i<array.length;i++){
        no.add(array[i]);
    }
    System.out.println(no);
    }


}