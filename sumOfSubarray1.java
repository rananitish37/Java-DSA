public class sumOfSubarray1 {
    public static void findSum(int []num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                int sum=0;
                for (int k = i; k <= j; k++) {
                    sum=sum+num[k];
                }
                System.out.println(sum);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        findSum(arr);
    }
}
