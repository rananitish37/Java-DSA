package divideconquer;

public class MergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[]=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j] && (nums1[i]!=0||nums2[j]!=0)){
                temp[k]=nums1[i];
                k++;i++;
            }else if(nums1[i] > nums2[j] && (nums1[i]!=0||nums2[j]!=0)){
                temp[k]=nums2[j];
                j++;k++;
            }else{
                if(nums1[i]==0){
                    i++;
                }else if(nums2[j]==0){
                    j++;
                }
            }
        }
        while(i<nums1.length){
            temp[k++]=nums1[i++];
        }
        while(j<nums2.length){
            temp[k++]=nums2[j++];
        }
        for(int p=0;p<temp.length;p++){
            System.out.print(temp[p]);
        }
    }
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m=3,n=3;
        merge(nums1, m, nums2, n);
    }
}
