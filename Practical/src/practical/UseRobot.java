
package practical;
import java.util.Scanner;
public class UseRobot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter label:");
        String label=sc.nextLine();
        System.out.print("Enter type:");
        int type=sc.nextInt();
        System.out.print("Enter step:");
        int step=sc.nextInt();
        Robot r1=new Robot(label,type);
        SpecRobot r2=new SpecRobot(step,label, type);
        boolean cont=false;
        do{
            System.out.println("1.Test toString()");
            System.out.println("2.Test setData()");
            System.out.println("3.Test getValue()");
            System.out.print("Enter TC(1,2,3):");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("OUTPUT:");
                    System.out.println(r1.toString());
                    System.out.println(r2.toString());
                    break;
                case 2:
                    System.out.println("OUTPUT:");
                    r2.setData(step);
                    Robot r3=new Robot(r2.getLabel(),type);
                    System.out.println(r3.toString());
                    break;
                case 3:
                    System.out.println("OUTPUT:");
                    System.out.println(r2.getValue());
                    break;
                default:
                    cont=true;
            }
        }while (cont);
    }
}
