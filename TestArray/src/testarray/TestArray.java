
package testarray;
import java.util.Scanner;
/**
 *
 * @author nunhu
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double thang10[]={8.5, 8.0, 7.0,6.5,5.5,4.9,4.0};
      double thang4[]={4.0,3.5,3,2.5,2,1.5,1,0};
      String diemchu[]={"A","B+","B","C+","C","D+", "D", "F"};
      String xeploai[]={"Gioi","Kha gioi","Kha","Trung binh kha","Trung binh","Trung binh yeu", "Yeu", "Kem (khong dat)"};
      System.out.print("Enter mark: ");
      Scanner scanner = new Scanner(System.in);
      double diem = scanner.nextDouble();
      int i=0;
      while (diem<thang10[i]) i++;
      System.out.println("Thang 10: " +diem);
      System.out.println("Thang 4: " +thang4[i]);
      System.out.println("Thang chu: " +diemchu[i]);
      System.out.println("Xep loai: " +xeploai[i]);
  }

}
