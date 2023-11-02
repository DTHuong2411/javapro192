
public class Robot {
    String label;
    int type;

    public Robot() {
    }

    public Robot(String label, int type) {
        this.label = label;
        this.type = type;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return  label + ", " + type;
    }
    
}
