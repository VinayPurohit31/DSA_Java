class ArrayIsSortedOrNot{
    public static void  main(String[] args) {
    int array[]={1,7,3,4,5,6,7};
    int temp=0;
    for (int i=0;i<array.length-1;i++){
        if(array[i]>=array[i+1]){
            temp=1;
            
        }
    }
    
    if(temp==1){
        System.out.println("Array is not sorted");
    }
    else{
        System.out.println("Array is sorted");
    }
  
    }
}