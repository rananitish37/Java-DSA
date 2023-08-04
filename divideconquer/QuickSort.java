package divideconquer;

public class QuickSort {
    public static void quicksort(int nums[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partition(nums,si,ei);
        quicksort(nums, si, pIdx-1);
        quicksort(nums, pIdx+1, ei);
    }
    public static int partition(int []nums,int si,int ei){
        int pivot=nums[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(nums[j] <= pivot){
                i++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        nums[ei]=nums[i];
        nums[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int []arr={2,6,7,4,1,9};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
