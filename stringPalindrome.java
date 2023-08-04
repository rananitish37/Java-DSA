public class stringPalindrome {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            char c=s.charAt(i);
            char ch=s.charAt(j);
            if(!Character.isLetter(c)){
                continue;
            }else if( !Character.isLetter(ch)){
                continue;
            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                return true;
            }
            i++;j--;
        }
    }
}
