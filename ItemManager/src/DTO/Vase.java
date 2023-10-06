
package DTO;
import java.util.Scanner;
public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
        super();
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void outputVase(){
        output();
        System.out.println("Height:"+height);
        System.out.println("Material:"+material);
    }
    
    public void inputVase(){
        input();
        boolean cont=true;
        Scanner sc=new Scanner(System.in);
        while(cont){
            try{
                System.out.print("Enter height: ");
                this.height=sc.nextInt();
                if(this.height<=0) throw new Exception();
                cont =false;
            } catch (Exception e){
                System.out.println("Height invalid!");
                cont=true;
            }
        }
        sc.nextLine();
        cont=true;
        while(cont){
            try{
                System.out.print("Enter material: ");
                this.material=sc.nextLine();
                if(this.material.isEmpty()) throw new Exception();
                cont =false;
            } catch (Exception e){
                System.out.println("Material is empty!");
                cont=true;
            }
        }
    }
}
