class SecondLargest{
    public static void main(String[] args) {
    
        int arr[]={10,20,30,40,50,10,20,30};
        int large=arr[0];
        int secondLarge=-1;
        //find the largest in the array
        for (int i=0;i<arr.length;i++){
            if (arr[i]>large){
                large=arr[i];
            }
        }
        //find the second largest in the array
        for (int i=0;i<arr.length;i++){
            if (arr[i]>secondLarge && arr[i]!=large){
                secondLarge=arr[i];
            }
        }
        System.out.println("Second largest no in the array is "+secondLarge);
    }

}