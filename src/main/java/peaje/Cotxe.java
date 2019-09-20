package peaje;

public class Cotxe extends Vehicle {
    private int numFileres;

    public Cotxe(int velocidad, int numEjes, int numRodes, int numFileres) {
        super(velocidad, numEjes, numRodes);
        this.numFileres = numFileres;
    }

    public int getNumFileres() {
        return numFileres;
    }

    public void setNumFileres(int numFileres) {
        this.numFileres = numFileres;
    }


}
