public class maxSumOfSubarray2 {
    public static void findSum(int []num) {
        int []prefix=new int[num.length];
        prefix[0]=num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+num[i];
        }
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int currentSum=0;
            for (int j = i+1; j < num.length; j++) {
                currentSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
            }
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        findSum(arr);
    }
}
