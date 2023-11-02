/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

public class Employee {
    private String c;
    private String n;
    private int s;

    public Employee(String c, String n, int s) {
        this.c = c;
        this.n = n;
        this.s = s;
    }
    public void print(){
        System.out.println("Code: "+this.c);
        System.out.println("Name: "+this.n);
        System.out.println("Salary: "+this.s);
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
    public int compareTo(Object emp){
        return this.getC().compareTo(((Employee)emp).getC());
    }
}
