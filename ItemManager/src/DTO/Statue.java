
package DTO;

import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
        super();
    }

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void outputStatue(){
        output();
        System.out.println("weight:"+weight);
        System.out.println("Colour:"+colour);
    }
    
    public void inputStatue(){
        input();
        boolean cont=true;
        Scanner sc=new Scanner(System.in);
        while(cont){
            try{
                System.out.print("Enter weight: ");
                this.weight=sc.nextInt();
                if(this.weight<=0) throw new Exception();
                cont =false;
            } catch (Exception e){
                System.out.println("Weight invalid!");
                cont=true;
            }
        }
        sc.nextLine();
        cont=true;
        while(cont){
            try{
                System.out.print("Enter colour: ");
                this.colour=sc.nextLine();
                if(this.colour.isEmpty()) throw new Exception();
                cont =false;
            } catch (Exception e){
                System.out.println("Colour is empty!");
                cont=true;
            }
        }
    }
}
