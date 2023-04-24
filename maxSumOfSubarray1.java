public class maxSumOfSubarray1 {
    public static void findMax(int []num) {
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                int currentSum=0;
                for (int k = i; k <= j; k++) {
                    currentSum=currentSum+num[k];
                }
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        findMax(arr);
    }
}
