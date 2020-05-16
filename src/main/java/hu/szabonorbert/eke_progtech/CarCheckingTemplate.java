package hu.szabonorbert.eke_progtech;

public abstract class CarCheckingTemplate {
    Car car;
    public CarCheckingTemplate(Car car){
        this.car = car;
    }
    public void checkTheCar(){
        getVision();
        openDoor();
        gettingIn();
        engineTest();
        gettingOut();
    }

    private void getVision(){
        System.out.println("ránéz az autóra");
    }
    protected abstract void openDoor();
    protected abstract void gettingIn();
    protected abstract void engineTest();
    protected abstract void gettingOut();
}
