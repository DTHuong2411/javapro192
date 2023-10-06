/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot.pkg10;

import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
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
   
    
     public void inputStatue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight=sc.nextInt();
        System.out.println("Enter colour: ");
        colour=sc.nextLine();
     }

    @Override
    public String toString() {
        return "Statue{" + "weight=" + weight + ", colour=" + colour + '}';
    }
     
}
