
public class SpecCar extends Car {
    private int type;

    public SpecCar() {
    }

    public SpecCar(int type) {
        this.type = type;
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+", "+  type ;
    }

    public void setData (){
       super.maker= "XZ"+super.maker;
       super.price=super.price +20;
    }
    
    public int getValue(){
        int inc;
        if (type<7) inc= 10;
        else inc = 15;
        return price+inc;
    }
}
