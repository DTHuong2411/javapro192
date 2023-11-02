/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;
import java.util.Vector;
import java.util.Scanner;
public class Menu extends Vector <String> {
    public Menu(){
        super();
    }
    void addMenuItem(String S){
        this.add(S);
    }
    int getUserChoice(){
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("EMPOLYEE MANAGER");
        System.out.println("1-Add new employee");
        System.out.println("2-Remove an employee");
        System.out.println("3-Promoting the employee's salary");
        System.out.println("4-Print the list");
        System.out.println("5-Save to files");
        System.out.println("6-Quit");
        System.out.print("Select 1..6: ");
        choice=sc.nextInt();
        return choice;
    }
    
}
