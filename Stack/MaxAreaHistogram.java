package Stack;

import java.util.Stack;

public class MaxAreaHistogram {
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];

        Stack<Integer> s=new Stack<>();
        //calculate next smallest in right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //calculate next smallest in left
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //calculate max area
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]+1;
            int currArea=height*width;
            maxArea=Math.max(maxArea, currArea);
        }
        System.out.println(maxArea);
    }
    public static void main(String[] args) {
        int arr[]={9,0};
        maxArea(arr);
    }
}
