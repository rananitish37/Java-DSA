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
    public static Node root = new Node();

    public static void insert(String s){
        Node curr = root;
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.endOfWord = true;
    }
    public static boolean search(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.endOfWord == true;
    }
    public static boolean wordBreakHelp(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0,i)) && wordBreakHelp(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word[]={"b"};

        for(int i=0; i<word.length;i++){
            insert(word[i]);
        }

        // System.out.println(search("three"));
        System.out.println(wordBreakHelp("a"));
    }
}
