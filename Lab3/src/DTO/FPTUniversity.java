/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author nunhu
 */
public class FPTUniversity extends University implements Role{
    String address;

    public FPTUniversity(int size) {
        super(size);
    }

    public FPTUniversity(int size, String address,  String name) {
        super(size, name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }
    

    @Override
    public void createWorker() {
        System.out.println("providing human resources");
    }
}
