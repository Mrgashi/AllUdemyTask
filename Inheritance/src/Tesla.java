public class Tesla extends Car {

    private String color;
    private String seatFabric;
    private boolean automatic;
    private boolean cruiseControl;
    private int buttons;
    private boolean autoPilot;

    public Tesla(int doors, String manufacture, String fuel, boolean sportMode) {
        super();
    }

    public Tesla() {
        super();
    }

    public Tesla(String color, String seatFabric, boolean automatic, boolean cruiseControl, int buttons, boolean autoPilot) {
        this.color = color;
        this.seatFabric = seatFabric;
        this.automatic = automatic;
        this.cruiseControl = cruiseControl;
        this.buttons = buttons;
        this.autoPilot = autoPilot;
    }

    @Override
    public void breaking() {
        System.out.println("Tesla regenerative breaks activated");
        super.breaking();
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla powers the Hamsters, making it go Zoom");
        super.accelerate();
    }

    @Override
    public void openHood() {
        System.out.println("Opens hood, but no engine is found! ");
    }

    @Override
    public void changeGear() {
        System.out.println("What gear? what is a gear? ");
    }

    public boolean isAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(boolean autoPilot) {
        this.autoPilot = autoPilot;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeatFabric() {
        return seatFabric;
    }

    public void setSeatFabric(String seatFabric) {
        this.seatFabric = seatFabric;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    public int getButtons() {
        return buttons;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

}
