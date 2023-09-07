/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot2_objects;

/**
 *
 * @author nunhu
 */
public class Honda extends Car {
	// Hiding implementation details
	@Override public void stop()
	{
		System.out.println("Honda::Stop");
		System.out.println(
			"Mechanism to stop the car using break");
	}
}