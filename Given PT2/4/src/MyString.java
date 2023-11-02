
public class MyString implements IString {
    
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase(); 
        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    @Override
    public int f1(String str) {
        String word[]=str.split("\\s+");
        int tong=0;
        for (String word1 : word) {
            if (!isPalindrome(word1))
                tong+=word1.length();
        }
        return tong;
    }

    @Override
    public String f2(String str) {
        for (int i=0; i<str.length(); i++){
            for (int j=i+1; j<str.length(); j++){
                if (str.charAt(j)== str.charAt(i)){
                    str=str.substring(0,j)+str.substring(j+1);
                }
            }
        }
        return str;
    }
    
}
