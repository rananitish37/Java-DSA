public class TrieImp {
    static class Node{
        Node children[] = new Node[26];
        boolean endOfWord = false;

        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    static Node root = new Node();

    public static void insert(String s){
        Node curr = root;
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[i];
        }

        curr.endOfWord = true;
    }
    public static void main(String[] args) {
        String word[]={"the","a","there","their","any","three"};

        for(int i=0; i<word.length;i++){
            insert(word[i]);
        }
    }
}
