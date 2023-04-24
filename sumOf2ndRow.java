public class sumOf2ndRow {
    public static void findSum(int num[][]){
        int ptr=1,sum=0;
        for(int i=0;i<num[0].length;i++){
            sum+=num[ptr][i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int [][]arr={{1,4,9},{11,4,3},{2,2,3}};
        findSum(arr);
    }
}
