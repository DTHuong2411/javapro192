
package carmanager;
import java.util.Scanner;
public class Tester {
    public static void main (String[] srgs){
        Car c=new Car();
        c.pressStarButton();
        c.pressAcceleratorButton();
        c.output();
        
        Car c2=new Car("red", 100,true,true);
        c2.pressAcceleratorButton();
        c2.setColour("black");
        System.out.println("Colour of c2:"+c2.getColour());
        c2.output();
    }
}
