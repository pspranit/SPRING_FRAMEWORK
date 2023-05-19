package Constructor_Injection;

public class PetrolCar implements Car{
    PetrolEngine engine;

    public PetrolCar(PetrolEngine engine) {
        this.engine = engine;
    }

    @Override
    public void getType() {
        System.out.println("CAR TYPE IS PETROL CAR");
    }

    @Override
    public void getEngineInfo() {
        engine.getType();
    }
}
