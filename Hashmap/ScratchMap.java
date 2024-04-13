package Hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class ScratchMap {
    static class HashMap<K,V>{
        private class Node {
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; //n
        private int N;
        private LinkedList<Node> bucket[];

       @SuppressWarnings("unchecked")
        public HashMap() {
            this.N=4;
            this.bucket = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.bucket[i] = new LinkedList<>();
            }
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = bucket;
            bucket = new LinkedList[N*2];
            N = N*2;

            for(int i=0; i<bucket.length; i++){
                bucket[i] = new LinkedList<>();
            }

            // node -> add in bucket
            for(int i=0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        private int hashFunction(K key) {
            int hc = key.hashCode(); //it can be negative or positive

            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = bucket[bi];
            int di=0;

            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        public void put(K key, V value){
            int bi = hashFunction(key); //0 to size-1
            int di = searchInLL(key,bi);

            if(di != -1){
                Node node = bucket[bi].get(di);
                node.value = value;
            }else{
                bucket[bi].add(new Node(key, value));
                n++;
            }

            double lambda = n/N;
            if(lambda > 2.0){
                rehash();
            }
        }
        
        public boolean containsKey(K key){
            int bi = hashFunction(key); //0 to size-1
            int di = searchInLL(key,bi);

            if(di != -1){
                return true;
            }else{
                return false;
            }
        }
        public V remove(K key){
            int bi = hashFunction(key); //0 to size-1
            int di = searchInLL(key,bi);

            if(di != -1){
                Node node = bucket[bi].remove(di);
                return node.value;
            }else{
                return null;
            }
        }
        public V get(K key){
            int bi = hashFunction(key); //0 to size-1
            int di = searchInLL(key,bi);

            if(di != -1){
                return bucket[bi].get(di).value;
            }else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> ans = new ArrayList<>();

            for(int i=0; i<bucket.length; i++){
                LinkedList<Node> ll = bucket[i];
                for(Node node : ll){
                    ans.add(node.key);
                }
            }
            return ans;
        }
        private boolean isEmpty(){
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("india", 100);
        hm.put("china", 200);
        hm.put("bhutan", 50);
        hm.put("nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for(int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i));
        } 
    }
}
