/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryBoy;
import java.util.Random;
/**
 *
 * @author nunhu
 */
class DeliveryBoy {
    public void deliver() {
        System.out.println("Delivering Item");
    }
  
    public static void main(String[] args) {
        DeliveryBoy deliveryBoy = getDeliveryBoy();
        deliveryBoy.deliver();
    }
  
    private static DeliveryBoy getDeliveryBoy() {
        Random random = new Random();
        int number = random.nextInt(5);
        return number % 2 == 0 ? new Postman() : new FoodDeliveryBoy();
    }
}
