public class UniqueSubstring {
    static class Node{
        Node children[] = new Node[26];

        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;

        for(int i=0; i<word.length(); i++){
            int idx= word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
    }
    public static int countNode(Node root){
        if(root == null) return 0;

        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count + 1;
    }
    public static void main(String[] args) {
        String s = "ababa";
        for(int i=0; i<s.length(); i++){
            String str = s.substring(i);
            insert(str);
        }

        System.out.println(countNode(root));
        
    }
}
