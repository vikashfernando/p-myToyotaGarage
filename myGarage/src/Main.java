public class Main{
    public static void main(String[] args){
        System.out.println("this is the main");

        Suv prado1=new Suv(2022,"black",6,"petrol");

        prado1.offRoadMode();  // a method from suv
        prado1.startEngine();
        String a=prado1.getColor();

        System.out.println(a);



    }
}