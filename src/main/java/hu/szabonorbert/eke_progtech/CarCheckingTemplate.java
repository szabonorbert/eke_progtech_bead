package hu.szabonorbert.eke_progtech;

public abstract class CarCheckingTemplate {
    Car car;
    public void checkTheCar(Car car){
        this.car = car;
        getVision();
        openDoor();
        gettingIn();
        engineTest();
        gettingOut();
        closeDoor();
    }
    private void getVision(){
        System.out.println("\t\t> ránéz az autóra");
    }
    protected abstract void openDoor();
    protected abstract void gettingIn();
    protected abstract void engineTest();
    protected abstract void gettingOut();
    protected abstract void closeDoor();
}
