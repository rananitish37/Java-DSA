public class trappingRainwater {
    public static void trapped(int num[]){
        int leftMax[]=new int[num.length];
        int rightMax[]=new int[num.length];
        leftMax[0]=num[0];
        for(int i=1;i<leftMax.length;i++){
            if(num[i]<leftMax[i-1]){
                leftMax[i]=leftMax[i-1];
            }else{
                leftMax[i]=num[i];
            }
        }
        rightMax[num.length-1]=num[num.length-1];
        for(int i=num.length-2;i>0;i--){
            if(num[i]<rightMax[i+1]){
                rightMax[i]=rightMax[i+1];
            }else{
                rightMax[i]=num[i];
            }
        }
        int totalTrappedwater=0;
        for(int i=0;i<num.length;i++){
            int trappedwater=0;
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            
            trappedwater=waterlevel-num[i];
            if(trappedwater<0){
                trappedwater=0;
            }
            totalTrappedwater +=trappedwater;
        }
        System.out.println(totalTrappedwater);
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        trapped(arr);
    }
}
