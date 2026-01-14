public class Suv extends ToyotaVehicle{
    //attributes
    private String engineType;

    //constructor
    public Suv(double y,String c,double p,String e){
        super(y,c,p);
        engineType=e;
    }


    //methods
    public void offRoadMode(){
        System.out.println("offRoadMode on");
    }
}