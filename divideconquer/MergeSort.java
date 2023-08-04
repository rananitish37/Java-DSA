package divideconquer;

public class MergeSort {
    public static void mergesort(int nums[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(nums, si, mid);
        mergesort(nums, mid+1, ei);
        merge(nums,mid,si,ei);
    }
    public static void merge(int nums[],int mid,int si,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(nums[i]<nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=ei){
            temp[k++]=nums[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            nums[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int []arr={2,8,4,9,6,1};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
