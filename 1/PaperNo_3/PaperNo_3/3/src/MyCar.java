
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyCar implements ICar {

    @Override
    public int f1(List<Car> t) {
        int sum=0;
        for(int i=0; i<t.size(); i++){
            sum+=t.get(i).getRate();
        }
        return sum/t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int min=0, max=0;
        for (int i=0; i<t.size(); i++){
            if(min>t.get(i).getRate()) min=t.get(i).getRate();
        }
        
        for (int i=0; i<t.size(); i++){
            if(max<t.get(i).getRate()) max=t.get(i).getRate();
        }
        int inmin=0, inmax=0;
        for (int i=0; i<t.size(); i++){
            if (t.get(i).getRate()== min)
                inmin=i; break;
        }
        
        for (int i=0; i<t.size(); i++){
            if (t.get(i).getRate()== max)
                inmax=i; break;
        }
        
        t.get(inmin).setRate(max);
        t.get(inmax).setRate(min);    
    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int makerComparison = o1.getMaker().compareTo(o2.getMaker());
                if (makerComparison != 0) {
                    // Nếu tên (maker) khác nhau, sắp xếp tăng dần theo tên (maker)
                    return makerComparison;
                } else {
                    // Nếu tên (maker) giống nhau, sắp xếp giảm dần theo rate
                    return Double.compare(o2.getRate(), o1.getRate());
                }
            }
        });
        System.out.println(t);
    }
}
