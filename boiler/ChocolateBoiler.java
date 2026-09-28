package boiler;

public class ChocolateBoiler {

    private static ChocolateBoiler instance;

    private boolean empty;
    private boolean heatingElementOn;
    private boolean mixing;

    private ChocolateBoiler() {
        empty = true;
        heatingElementOn = false;
        mixing = false;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public void fill() {
        if (empty == true && heatingElementOn == false) {
            empty = false;
            System.out.println("Boiler filled with chocolate and milk mixture");
        } else {
            System.out.println("Cannot fill: boiler must be empty and heating element off");
        }
    }

    public void startMixing() {
        if (empty == false && heatingElementOn == false) {
            mixing = true;
            System.out.println("Mixing process started");
        } else {
            System.out.println("Cannot start mixing: boiler must be full and heating element off");
        }
    }

    public void drain() {
        if (empty == false && heatingElementOn == true) {
            empty = true;
            mixing = false;
            System.out.println("Boiler drained");
        } else {
            System.out.println("Cannot drain: boiler must not be empty and heating element on");
        }
    }

    public void turnOnHeatingElement() {
        heatingElementOn = true;
        System.out.println("Heating element on");
    }

    public void turnOffHeatingElement() {
        heatingElementOn = false;
        System.out.println("Heating element off");
    }

    public void showState() {
        System.out.println("Empty: " + empty);
        System.out.println("Heating element on: " + heatingElementOn);
        System.out.println("Mixing: " + mixing);
    }
}