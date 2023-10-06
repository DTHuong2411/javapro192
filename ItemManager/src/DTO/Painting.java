
package DTO;
import java.util.Scanner;
public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFrame;

    public Painting() {
        super();
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
    
     public void outputPainting(){
        output();
        System.out.println("Height:"+height);
        System.out.println("Width:"+width);
        System.out.println("isWatercolour:"+isWatercolour);
        System.out.println("isFrame:"+isFrame);
    }
    
     public void inputPainting(){
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
                System.out.print("Enter width: ");
                this.width=sc.nextInt();
                if(this.width<=0) throw new Exception();
                cont =false;
            } catch (Exception e){
                System.out.println("Width invalid!");
                cont=true;
            }
        }
    }
}
