public class length {
    public static int[] findColumnWidth(int[][] grid) {
        int [] res=new int[grid[0].length];
        
        for(int j=0;j<grid[0].length;j++){
            int maxCount=0;
            for(int i=0;i<grid.length;i++){
                int temp=grid[i][j];
                int count=0;
                
                while(temp!=0){
                    count++;
                    temp=temp/10;
                }
                if(grid[i][j]<0){
                    count=count+1;
                }
                maxCount=Math.max(count,maxCount);
                
            }
            res[j]=maxCount;
        }
        
        return res;
    }
    public static void main(String[] args) {
        int [][] arr={{5},{12},{555}};
        int [] res=findColumnWidth(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
