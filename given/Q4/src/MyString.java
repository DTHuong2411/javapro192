
public class MyString implements IString {
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public int f1(String str) {
        int count=0;
        boolean t=true;
        for (int i=0; i<str.length(); i++){
            if ( Character.isDigit(str.charAt(i))){
                int num = Character.getNumericValue(str.charAt(i));
                if (isPrime(num) == true ) count=count+1;
                }
            }
        return count;
        }

    @Override
    public String f2(String str) {
        String[] w= str.split(" ");
        int l=0;
        int r=w.length-1;
        while(l<r){
            String temp =w[l];
            w[l]=w[r];
            w[r]=temp;
            l++; r--;
        }
        StringBuilder rStr= new StringBuilder();
        for(String word : w){
            rStr.append(word).append(" ");
        }
        return rStr.toString().trim();
    }
    
}
