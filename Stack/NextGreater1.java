package Stack;

import java.util.*;
public class NextGreater1 {
    public static int[] nextGreater(int []nums){
        Stack<Integer> s=new Stack<>();
        int[] nextGreater=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()] <=nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=nums[s.peek()];
            }
            s.push(i);
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        int[] nums={6,8,0,1,3};
        int res[]=nextGreater(nums);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
