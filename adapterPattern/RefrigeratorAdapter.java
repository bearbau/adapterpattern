public class RefrigeratorAdapter implements PowerOutlet{
    private Refrigerator fridge;

    public RefrigeratorAdapter(Refrigerator fridge){
        this.fridge = fridge;
    }

    @Override
    public String plugIn(){
        return startCooling();
    }
}