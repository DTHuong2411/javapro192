
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyRobot implements IRobot{

    @Override
    public int f1(List<Robot> t) {
        int sum=0;
        for(int i=0; i<t.size(); i++){
            if (!(t.get(i).getLabel().contains("A")) && !(t.get(i).getLabel().contains("B"))){
                sum+=t.get(i).getStep();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Robot> t) {
        int max=0;
        for(int i=0; i<t.size(); i++){
            if (max<t.get(i).getStep())
                max=t.get(i).getStep();
        }
        
        int index=0;
        
        for(int i=0; i<t.size(); i++){
            if (max == t.get(i).getStep()){
                index=i;
                break;
            }
        } 
        
        t.remove(index);
    }

    @Override
    public void f3(List<Robot> t) {
        List<Robot> nRobot= (t.subList(1, 5));
        
        Collections.sort(nRobot, new Comparator<Robot>() {
            @Override
            public int compare(Robot o1, Robot o2) {
                int stepComparison = Integer.compare(o1.getStep(), o2.getStep());
                if (stepComparison != 0) {
                    return stepComparison;
                } else {
                    return o1.getLabel().compareTo(o2.getLabel());
                }
            }
        });
    }
    
}
