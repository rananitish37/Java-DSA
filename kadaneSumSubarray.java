public class kadaneSumSubarray {
    public static void kadane(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            currSum=currSum+num[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        //if all elements of the array are negative so:
        if(maxSum==0){
            maxSum=num[0];
            for(int i=1;i<num.length;i++){
                if(num[i]>maxSum){
                    maxSum=num[i];
                }
            }
            System.out.println(maxSum);
        }//end of condition for all numbers are negative number
        else{
            System.out.println(maxSum);
        }
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(arr);
    }
}
