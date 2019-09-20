package peaje;

public class Camio extends Vehicle{
    private int pes;

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    public Camio(int velocidad, int numEjes, int numRodes, int pes) {
        super(velocidad, numEjes, numRodes);
        this.pes = pes;
    }


}
