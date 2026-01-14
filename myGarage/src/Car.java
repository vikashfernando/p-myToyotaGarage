public class Car extends ToyotaVehicle{
    //attributes
    private double batterySize;

    //constructor
    public Car(double y,String c,Double p,double b){
        super(y,c,p);
        batterySize=b;
    }

    //methods
    public void sportMode(){
        System.out.println("sport mode on");
    }
}
