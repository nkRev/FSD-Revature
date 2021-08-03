package com.nicky.day6;
interface ICar{
    void getCarModel();
    void getCarColor();
}
class Audi implements ICar{

    @Override
    public void getCarModel() {
        System.out.println("Audi S5");
    }

    @Override
    public void getCarColor() {
        System.out.println("White");
    }
}

class BMW implements ICar{

    @Override
    public void getCarModel() {
        System.out.println("BMW M3");
    }

    @Override
    public void getCarColor() {
        System.out.println("Blue");
    }
}
class CarFactory{
    public static ICar getCarInstance(int id){
        switch (id){
            case 1:
                return new Audi();
            case 2:
                return new BMW();
            default:
                    return null;

        }
    }
}
public class Demo6 {
    public static void main(String[] args) {
        ICar car1 = CarFactory.getCarInstance(2);
        ICar car2 = CarFactory.getCarInstance(1);
        ICar car3 = CarFactory.getCarInstance(0); // will point to null

        car1.getCarModel();
        car1.getCarColor();
        car2.getCarModel();
        car2.getCarColor();


        //car3 does not exist
        try{
            car3.getCarColor();
            car3.getCarModel();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

    }
}
