class oneRotate{
    public static void main(String[] args) {
    int array[]={1,2,3,4,5};
    int first=array[0];
    for(int i=0;i<array.length-1;i++){
        array[i]=array[i+1];
    }
    array[array.length-1]=first;
    for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
    }

    }
    
}