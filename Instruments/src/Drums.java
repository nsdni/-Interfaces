public class Drums implements Instrument{
    int sizeDrum;

    public Drums(int sizeDrum) {
        this.sizeDrum = sizeDrum;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером - " + sizeDrum);
    }
}
