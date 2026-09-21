public class Main {
    public static void main (String args[]){
        Laptop laptop = new Laptop();
        PowerOutlet laptopPlug = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorPlug = new RefrigeratorAdaptor(refrigerator);

        SmartphoneCharger smartphone = new SmartphoneCharger();
        PowerOutlet smartphoneChargerPlug = new SmartphoneAdapter(smartphone);

        // Turn on the appliances
        System.out.println(laptop.plugIn());
        System.out.println(refrigerator.plugIn());
        System.out.println(smartphone.plugIn());
        
    }
}
