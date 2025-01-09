package org.abstraction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.engineType();
        myCar.millege();
        myCar.run(1);
        myCar.color();
    }
}