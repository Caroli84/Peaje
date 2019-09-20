package peaje;

public class Vehicle {
    private int velocidad;
    private int numEjes;
    private int numRodes;

    public Vehicle(int velocidad, int numEjes, int numRodes) {
        this.velocidad = velocidad;
        this.numEjes = numEjes;
        this.numRodes = numRodes;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public int getNumRodes() {
        return numRodes;
    }

    public void setNumRodes(int numRodes) {
        this.numRodes = numRodes;
    }


}
