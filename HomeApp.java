public class HomeApp {
    private HomeInterface homeInterface;

    public HomeApp(HomeInterface homeInterface) {
        this.homeInterface = homeInterface;
    }

    public void turnEverythingOn() {
        System.out.println("Turning on all services...");
        homeInterface.turnOnAll();
    }

    public void turnEverythingOff() {
        System.out.println("Turning off all services...");
        homeInterface.turnOffAll();
    }

    public static void main(String[] args) {
        // Create a HomeInterface instance (facade)
        HomeInterface homeInterface = new HomeInterface();

        // Create the client HomeApp
        HomeApp app = new HomeApp(homeInterface);

        // Control the home services through the facade
        app.turnEverythingOn();
        app.turnEverythingOff();
    }
}