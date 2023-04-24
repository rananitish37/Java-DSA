public class numInArray {
    public static void findSeven(int [][]num){
        int count=0;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                if(num[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int [][]arr={{4,7,8},{8,8,7}};
        findSeven(arr);
    }
}
