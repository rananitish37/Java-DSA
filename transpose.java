public class transpose {
    public static void transposed(int [][]num){
        int [][]arr=new int[num[0].length][num.length];
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                arr[j][i]=num[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3},
                    {4,5,6}};
        transposed(arr);
    }
}
