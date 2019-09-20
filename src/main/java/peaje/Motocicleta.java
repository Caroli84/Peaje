package peaje;

public class Motocicleta extends Vehicle {

    private boolean portaCopilot;

    public Motocicleta(int velocidad, int numEjes, int numRodes, boolean portaCopilot) {
        super(velocidad, numEjes, numRodes);
        this.portaCopilot = portaCopilot;
    }

    public boolean isPortaCopilot() {
        return portaCopilot;
    }

    public void setPortaCopilot(boolean portaCopilot) {
        this.portaCopilot = portaCopilot;
    }


}
