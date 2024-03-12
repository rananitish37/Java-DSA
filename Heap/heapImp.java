import java.util.ArrayList;

public class heapImp {

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        
        public void add(int data){ //O(logn)
            //add at last index
            arr.add(data);


            //fix heap
            int child = arr.size()-1; //child index
            int parent = (child-1)/2; //parent index

            while (arr.get(child) < arr.get(parent)) { //O(logn)
                int temp = arr.get(child);
                arr.set(child, arr.get(parent));
                arr.set(parent, temp);
                child = parent;
                parent = (child -1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        
    }
    
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(2);
        hp.add(10);
        hp.add(5);
        hp.add(4);
        hp.add(1);
        hp.add(3);

        System.out.println(hp.arr);
    }
}
