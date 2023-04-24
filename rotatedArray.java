public class rotatedArray {
    public static int findELement(int[] num,int key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key==num[mid]){
                return mid;
            }
            if(num[start]<=num[mid]){
                if(key<num[mid] && key >= num[start]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(key>num[mid] && key<=num[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={4,5,6,7,0,1,2};
        System.out.println(findELement(a,0)); 
    }
}
