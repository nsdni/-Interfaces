public class Guitar implements Instrument{
    int numbCord;

    public Guitar(int numbCord) {
        this.numbCord = numbCord;
    }

    @Override
    public void play() {
        System.out.println("Гитара играет " + numbCord + " струной");
    }
}
