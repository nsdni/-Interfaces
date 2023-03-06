public class Truba implements Instrument{

    int diameter;

    public Truba(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром - " + diameter);
    }
}
