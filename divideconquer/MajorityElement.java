package divideconquer;
public class MajorityElement{
    public static int count(int nums[]){
        int majoritycount=nums.length/2;
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>majoritycount){
                return count;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,5,2,2,2,3,3,2,5};
        System.out.print(count(arr));
    }
}