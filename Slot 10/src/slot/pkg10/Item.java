/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot.pkg10;

import java.util.Scanner;
import Exceptions.EmptyValueException;
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
        boolean loop=true;
        Scanner sc=new Scanner(System.in);
        while(loop){
            try{
                System.out.print("Enter value");
            }
        }
        
    }

    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + '}';
    }
    
    
}