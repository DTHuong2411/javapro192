
package classstring;
import java.util.Scanner;
public class ClassString {

    public static void main(String[] args) {
        String S="Anh hùng khôn quá mỹ nhân quan";
        Scanner sc1=new Scanner(S);
        System.out.println();
        String S2="abc 123 556.78";
        Scanner sc2=new Scanner (S2);
        System.out.println(sc2.next());
        System.out.println(sc2.nextInt());
        System.out.println(sc2.nextDouble());
        System.out.println();
        String S3="  How are     you!   ";
        String delim="[au\\s]+";
        Scanner sc3=new Scanner (S3);
        sc3.useDelimiter(delim);
        while (sc3.hasNext()) System.out.println(sc3.next());
    }
    
}
