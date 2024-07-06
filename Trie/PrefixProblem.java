class PrefixProblem {
    static class Node{
        Node[] children = new Node[26];
        int freq;
        boolean eow = false;
        
        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
            freq = 1;
        }
        
    }
    static Node root = new Node();
    
    static void insert(String word){
        Node curr = root;  
        
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow=true;
    }
    static int k=0;
    static void getPrefix(Node root,String[] res, String ans){
        if(root == null) return;
        
        if(root.freq == 1){
            // System.out.println(ans); 
            res[k] = ans;
            k++;
            return;
        }
        for(int i=0; i<root.children.length; i++){
            if(root.children[i] != null){
                getPrefix(root.children[i], res, ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        // code here
        String arr[] = {"zebra","dog","duck","dove"};
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
        root.freq =-1;
        String res[] = new String[arr.length];
        getPrefix(root, res, "");

        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }
}
