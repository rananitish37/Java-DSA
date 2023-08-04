package divideconquer;

public class mergeSortForString {
    public static String[] mergesort(String nums[],int lo,int ho){
        if(lo==ho){
            String []A={nums[lo]};
            return A;
        }
        int mid=lo+(ho-lo)/2;
        String[] str1= mergesort(nums, lo, mid);
        String[] str2= mergesort(nums, mid+1, ho);
        String res[]=merge(str1,str2);
        return res;
    }
    public static String[] merge(String str1[],String str2[]){
        int n=str1.length;
        int m=str2.length;
        String temp[]=new String[n+m];
        int idx=0;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(isAlphabeticallySmaller(str1[i],str2[j])){
                temp[idx]=str1[i];
                idx++;i++;
            }else{
                temp[idx]=str2[j];
                idx++;j++;
            }
        }
        while(i<n){
            temp[idx]=str1[i];
            idx++;i++;
        }
        while(j<m){
            temp[idx]=str2[j];
            idx++;j++;
        }
        return temp;
    }
    public static boolean isAlphabeticallySmaller(String str1,String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String []arr={"earth","sun","mars","mercurry"};
        String result[]= mergesort(arr,0,arr.length-1);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
