
package DTO;
import java.util.Scanner;
public class Item {
    int value;
    String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    
    public void input(){
        boolean cont=true;
        Scanner sc=new Scanner(System.in);
        while(cont){
            try{
                System.out.print("Enter value: ");
                this.value=sc.nextInt();
                if(this.value<=0) throw new Exception();
                cont =false;
            } catch (Exception e){
                System.out.println("Value invalid!");
                cont=true;
            }
        }
        sc.nextLine();
        cont=true;
        while(cont){
            try{
                System.out.print("Enter creator: ");
                this.creator=sc.nextLine();
                if(this.creator.isEmpty()) throw new Exception();
                cont =false;
            } catch (Exception e){
                System.out.println("Creator is empty!");
                cont=true;
            }
        }
    }
    
    public void output(){
        System.out.println("Value: "+value);
        System.out.println("Creator: "+creator);
    }
}
