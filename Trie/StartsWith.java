public class StartsWith {
    static class Node{
        Node children[] = new Node[26];

        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }
    }
    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
    }

    public static boolean startWith(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) -'a';
            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String[] args) {
        String words[] = {"i", "love", "eating", "burger"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startWith("burg"));
        System.out.println(startWith("ch"));

    }
}
