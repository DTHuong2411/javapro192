
package workshop1;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row;
        int col; 
        int a[][];
        System.out.print("Enter number of rows: ");
        row=sc.nextInt();
        System.out.print("Enter number of cols: ");
        col=sc.nextInt();
        a=new int[row][col];
        System.out.println("Enter the matrix:");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print("\nm["+i+"]["+j+"]=");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix inputted:");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){    
                System.out.format("%3d",a[i][j]);
            }
            System.out.println("\n");
        }
        int sum=0;
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){   
                sum=sum+a[i][j];
            }
        }
        System.out.println("Sum:"+ sum);
        System.out.println("Averange: "+(float)sum/(row*col));
    }
}
