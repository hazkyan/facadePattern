public class HomeInterface {
    private Light light;
    private TV tv;
    private AirConditioning ac;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new TV();
        this.ac = new AirConditioning();
    }

    // Method to turn on all devices
    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        ac.turnOn();
    }

    // Method to turn off all devices
    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        ac.turnOff();
    }
}
