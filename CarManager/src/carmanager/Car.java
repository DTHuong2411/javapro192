
package carmanager;
public class Car {
    String Colour;
    int EnginePower;
    boolean Convertible;
    boolean ParkingBrake;
    //constructors
    public Car(){}

    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
    public String getColour(){    
        return Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }
    
    public boolean isParkingBrake() {    
        return ParkingBrake;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }

    
    //other logic methods
    public void pressStarButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }
    public void output(){
        System.out.println(Colour);
        System.out.println(EnginePower);
        System.out.println(Convertible);
        System.out.println(ParkingBrake);     
    }
}
