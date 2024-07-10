
class leatcode1{
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 13;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if(target==nums[i]+nums[j])
            {
                System.out.println("index1="+i+"index2="+j);
            }
        }
    }


}
}