package BitMan;

import org.w3c.dom.traversal.NodeIterator;

public class bitOprn {
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask) != 0){
            return 1;
        }else{
            return 0;
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        n=n | bitMask;
        return n;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static int updateBit(int n,int i){
        if(getIthBit(n, i)==1){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }
    public static int  clearIBits(int n,int i){
        int bitMask=~0<<i;
        return n & bitMask;
    }
    public static int clearRange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }
    public static boolean isPowOfTwo(int n){
        if((n & (n-1)) ==0){
            return true;
        }else{
            return false;
        }
    }
    public static int countOneInNum(int n){
        int count=0;
        while(n !=0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastExpo(int a,int N){
        int ans=1;
        while(N>0){
            if((N&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            N=N>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=3,N=5;
        // System.out.println(setIthBit(n, 1));
        // System.out.println(getIthBit(n,2)); 
        // System.out.println(clearIthBit(n, 2));
        // System.out.println(updateBit(n,0));
        // System.out.println(clearIBits(n, 2));
        // System.out.println(clearRange(2515, 2, 7));//n=2515 100111010011  => 100100000011  2307
        // System.out.println(isPowOfTwo(n));
        // System.out.println(countOneInNum(n));
        System.out.println(fastExpo(n, N));
        }
}
