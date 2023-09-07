package slot2_inheritance;
class Car {
    // the Car class have one field
    public String wheelStatus;
    public int noOfWheels;
  
    // the Car class has one constructor
    public Car(String wheelStatus, int noOfWheels)
    {
        this.wheelStatus = wheelStatus;
        this.noOfWheels = noOfWheels;
    }
  
    // the Car class has three methods
    public void applyBrake()
    {
        wheelStatus = "Stop"; 
        System.out.println( "Stop the car using break");
    }
  
    // toString() method to print info of Car
    @Override
    public String toString()
    {
        return ("No of wheels in car " + noOfWheels + "\n"
                + "status of the wheels " + wheelStatus);
    }
}