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

            /*to change this min heap to max heap change the sign from less than to greater than
             * while (arr.get(child) > arr.get(parent)) {
             */

            
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
        public boolean isEmpty(){
            return arr.size() == 0;
        }

        private void heapify(int idx){
            //step 1: find the left and right child of currnet node and assign curr node as min
            int left = 2*idx +1;
            int right = 2*idx +2;
            int minIdx = idx;

            /*to change this min heap to max heap change the sign from less than to greater than
             * if(left < arr.size() && arr.get(left) > arr.get(minIdx)){
             */

            
            //left < arr.size() -> check that we are not in leaf 
            if(left < arr.size() && arr.get(left) < arr.get(minIdx)){
                minIdx = left;
            }

            /*to change this min heap to max heap change the sign from less than to greater than
             * if(left < arr.size() && arr.get(left) > arr.get(minIdx)){
             */
            

            // same for right child
            if(right < arr.size() && arr.get(right) < arr.get(minIdx)){
                minIdx = right;
            }

            //swap if minIdx is not equal to idx
            if(minIdx != idx){
                int  temp = arr.get(minIdx);
                arr.set(minIdx, arr.get(idx));
                arr.set(idx, temp);

                //call the heapify to check for new min
                heapify(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            //step 1(swap)
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step 2: (remove last index)
            arr.remove(arr.size()-1);

            //step 3: (fix heap)
            heapify(0);
            return data;
        }
        
    }
    
    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(2);
        pq.add(5);
        pq.add(4);
        pq.add(1);
        pq.add(3);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
        System.out.println();
        System.out.println("NOTE: HEAP IS SIMILER AS A PRIORITY QUEUE SO WE CAN SAY PQ IN JAVA COLLECTION FRAMEWORK IS IMPLEMENTED USING HEAP");
        System.out.println();
    }
}
