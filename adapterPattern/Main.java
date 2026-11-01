public class Main {
    public static void main(String args[]) {
        Laptop laptop = new Laptop();
        PowerOutlet laptopPlug = new LaptopAdapter(laptop);
 
        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorPlug = new RefrigeratorAdapter(refrigerator);
 
        SmartphoneCharger smartphone = new SmartphoneCharger();
        PowerOutlet smartphoneChargerPlug = new SmartphoneAdapter(smartphone);
 
        // Turn on the appliances
        System.out.println(laptopPlug.plugIn());
        System.out.println(refrigeratorPlug.plugIn());
        System.out.println(smartphoneChargerPlug.plugIn());
    }
}
 