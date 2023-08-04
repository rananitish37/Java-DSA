package divideconquer;

public class InversionCount {
    public static void inversioncount(int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j<nums.length-1){
                if(nums[i]>nums[j]){
                    count++;
                }
                j++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,6};
        inversioncount(arr);
    }
}
