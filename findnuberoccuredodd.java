import java.util.HashSet;

// iven an array where every element occured even number of time axcept one .find that number
public class findnuberoccuredodd {
    public static void findNum(int num[]){
        int key=0;
        for(int i=0;i<num.length;i++){
            key=key ^ num[i];
        }
        System.out.println(key);
    }
    public static void main(String[] args) {
        int a[]={10,10,30,4,5,30,40,40,30,30,5};
        findNum(a);
    }
}


