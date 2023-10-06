/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot.pkg10;
import java.util.Scanner;
public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFrame;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFrame) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFrame = isFrame;
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFrame, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFrame = isFrame;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFrame() {
        return isFrame;
    }

    public void setIsFrame(boolean isFrame) {
        this.isFrame = isFrame;
    }
    
     public void inputStatue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height: ");
        height=sc.nextInt();
        System.out.println("Enter width: ");
        width=sc.nextInt();
        System.out.println("Enter isWatercolour: ");
        isWatercolour=sc.nextBoolean();
        System.out.println("Enter isFrame: ");
        isFrame=sc.nextBoolean();
     }

    @Override
    public String toString() {
        return "Painting{" + "height=" + height + ", width=" + width + ", isWatercolour=" + isWatercolour + ", isFrame=" + isFrame + '}';
    }
     
}

