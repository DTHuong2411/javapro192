
public class SpecRobot extends Robot {
    private int step;

    public SpecRobot() {
    }

    public SpecRobot(int step) {
        this.step = step;
    }

    public SpecRobot( String label, int type,int step) {
        super(label, type);
        this.step = step;
    }

    @Override
    public String toString() {
        return super.toString()+", " + step ;
    }
    
    public void setData(){
        super.label= super.label.substring(0,1)+ String.valueOf(step)+super.label.substring(1);
    }
    
    public int getValue(){
        boolean check=false;
        for(int i=0; i<super.label.length(); i++){
            if (super.label.charAt(i) == 'A')
                check= true; break;
        }
        if (type<3 && check==true)
            return step;
        else return step+2;
    }
    
}
