package org.abstraction;

public class Car extends Vehicle  implements VehicleFeatures{
    @Override
    public void engineType() {
        System.out.println("3 cylinder");
    }

    @Override
    public void run(Integer i) {
        if(i == 1){
            System.out.println("Vehicle started");
        }
      else {
            System.out.println("Vehicle not started");
        }
    }




    @Override
    public void color() {
        System.out.println("Vehicle color is blue");
    }
}
