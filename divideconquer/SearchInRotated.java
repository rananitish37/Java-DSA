package divideconquer;

public class SearchInRotated {
    public static int serachRotated(int nums[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(nums[mid]==tar){
            return mid;
        }
        if(nums[si]<=nums[mid]){
            if(nums[si]<=tar && tar <= mid){
                return serachRotated(nums, tar, si, mid-1);
            }else{
                return serachRotated(nums, tar, mid+1, ei);
            }
        }else{
            if(nums[mid]<=tar && tar <=nums[ei]){
                return serachRotated(nums, tar, mid+1, ei);
            }else{
                return serachRotated(nums, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(serachRotated(arr, 1, 0, arr.length));
    }
}
