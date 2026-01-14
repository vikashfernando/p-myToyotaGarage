public class Main{
    public static void main(String[] args){
        System.out.println("this is the main");


        //create a prado suv
        Suv prado1=new Suv(2022,"black",6,"petrol");

        prado1.offRoadMode();  // a method from Suv
        prado1.startEngine();  //a method from ToyotaVehicle
        System.out.println(prado1.getColor());
        prado1.startEngine();

        //create a axio car
        Car axio1=new Car(2022,"white",1,1200);


        System.out.println("**********************");

        //create a vehicle typed car
        ToyotaVehicle allion1=new Car(2025,"wineRed",2,1500);

        allion1.startEngine();


        System.out.println("**********************");



    }
}