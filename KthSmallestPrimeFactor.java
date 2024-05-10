public class KthSmallestPrimeFactor {
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double low = 0.0, high = 1.0;
        int[] ans = new int[2];
        while (low < high) {
            double mid = (low + high) / 2;
            int count = 0;
            int p = 0, q = 1;
            for (int i = 0, j = 0; i < n; i++) {
                while (j < n && arr[i] >= mid * arr[j]) {
                    j++;
                }
                count += n - j;
                if (j < n && p * arr[j] < q * arr[i]) {
                    p = arr[i];
                    q = arr[j];
                }
            }
            if (count == k) {
                ans[0] = p;
                ans[1] = q;
                break;
            } else if (count < k) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int ans[] = kthSmallestPrimeFraction(arr, 3);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
