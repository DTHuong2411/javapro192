
package workshop1;
import java.util.Scanner;
public class Part3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] list=new String[100];
        int n;
        System.out.print("Enter the number of student: ");
        n=sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.print("Enter name of student "+(i+1)+": ");
            sc=new Scanner(System.in);
            list[i]=sc.nextLine();
        }
        for (int i=0; i<n; i++){
            System.out.println("Student "+(i+1)+": "+list[i].toUpperCase());
        }
    }
}
