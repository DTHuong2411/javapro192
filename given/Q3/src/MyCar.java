
import java.util.List;
import java.util.Collections;

public class MyCar implements ICar {

    @Override
    public int f1(List<Car> t) {
        int sum=0;
        for (int i=0; i<t.size(); i++){
            sum+= t.get(i).rate;
        }
        return sum/ t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int max = t.get(0).rate;
        int imax=1;
        for(int i=1; i<t.size();i++){
            if (max < t.get(i).rate){
                max= t.get(i).rate;
                imax=i;
            }
        }
        int min=t.get(0).rate;
        int imin=0;
        for(int i=1; i<t.size(); i++){
            if (min > t.get(i).rate){
                min =t.get(i).rate;
                imin=i;
            }
        }
        Car temp =t.get(imax);
        t.set(imax, t.get(imin));
        t.set(imin, temp);

    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t,(t1, t2) -> {
            if (t1.maker.equals(t2.maker)){
                return Integer.compare(t2.rate, t1.rate);
            }
            return t1.maker.compareTo(t2.maker);
        });
    }
    
}
