
public class SpecCar extends Car {
    private int type;

    public SpecCar() {
        super();
    }
 
    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.maker + "; " + super.price + "; " + type;
    }

    public void setData () {
       super.setMaker("XZ"+super.getMaker());
       super.setPrice(super.getPrice()+20); 
    }

    public int getValue(){
         if(type<7) return super.getPrice()+10;
        else return super.getPrice()+15;
    }
}
