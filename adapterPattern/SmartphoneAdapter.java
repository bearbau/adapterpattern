public class SmartphoneAdapter implements PowerOutlet {
    private final SmartphoneCharger charger;
 
    public SmartphoneAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }
 
    @Override
    public String plugIn() {
        return charger.chargePhone();
    }
}