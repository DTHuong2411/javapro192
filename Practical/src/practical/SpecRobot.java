
package practical;

public class SpecRobot extends Robot{
    int step;
    public SpecRobot(){}

    public SpecRobot(int step, String label, int type) {
        super(label, type);
        this.step = step;
    }

    @Override
    public String toString() {
        return label+","+type+","+step;
    }

    public void setData(int step){
        this.label= String.valueOf(label.charAt(0))+String.valueOf(step)+label.substring(1);
    }

    public String getLabel() {
        return label;
    }
    
    public int getValue() {
        boolean c=false;
        for (int i=0; i<label.length(); i++){
            if (label.charAt(i) == 'A') c=true;
        }
        if (c=true && type<3){
            return step;
        } else return step+2;
    }
    
}
