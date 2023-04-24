import java.util.Arrays;
import java.util.Collections;

/*Question :Use the following sorting algorithms to sort an array in DESCENDING order :
a.Bubble Sort b.Selection Sort c.Insertion Sort d.Counting SortYou can use this array as an 
example :[3,6,2,1,8,7,4,5,3,1]*/

public class sort {
    public static void printArray(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void bsort(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        
    }
    public static void ssort(int num[]){
        for(int i=0;i<num.length;i++){
            int min=i;
            for(int j=i+1;j<num.length;j++){
                if(num[min]>num[j]){
                    min=j;
                }
            }
            int temp=num[i];
            num[i]=num[min];
            num[min]=temp;
        }
    }
    public static void isort(int num[]){
        for(int i=1;i<num.length;i++){
            int curr=num[i];
            int j=i-1;
            while(num[j]<curr && j>=0){
                num[j+1]=num[j];
                j--;
            }
            num[j+1]=curr;
        }
    }
    public static void csort(int num[]){
        int max=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        int count[]=new int[max+1];
        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            
            while(count[i]>0){
                num[j]=i;
                count[i]--;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        // bsort(arr);
        // ssort(arr);
        // isort(arr);
        // Arrays.sort(arr,Collections.reverseOrder());
        csort(arr);
        printArray(arr);
    }
}
