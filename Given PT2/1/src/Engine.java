


public class Engine {
    private String designer;
    private int power;

    public Engine() {
    }

    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDesigner() {
        String n= designer.substring(0,1);
        return n.toLowerCase()+designer.substring(1,3);
    }

    public int getPower() {
        return power;
    }
    
}
